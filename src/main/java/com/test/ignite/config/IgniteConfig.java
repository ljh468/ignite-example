package com.test.ignite.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.ShutdownPolicy;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi;
import org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Slf4j
@Configuration
public class IgniteConfig {

  @Value("${spring.application.name}")
  private String nodeName;

  @Value("${ignite.cluster.name}")
  private String clusterName;

  @Value("${ignite.tcp.multicastAddresses}")
  private String[] multicastAddresses;

  @Bean
  public Ignite igniteInstance() {
    IgniteConfiguration configuration = new IgniteConfiguration();
    configuration.setIgniteInstanceName(clusterName);
    configuration.setConsistentId(nodeName);
    configuration.setPeerClassLoadingEnabled(true);
    configuration.setShutdownPolicy(ShutdownPolicy.GRACEFUL);
    configuration.setClientMode(false);

    // NOTE: TCP Discovery
    TcpDiscoverySpi tcpDiscoverySpi = new TcpDiscoverySpi();
    TcpDiscoveryMulticastIpFinder ipFinder = new TcpDiscoveryMulticastIpFinder();
    ipFinder.setAddresses(Arrays.asList(multicastAddresses));
    tcpDiscoverySpi.setIpFinder(ipFinder);
    configuration.setDiscoverySpi(tcpDiscoverySpi);

    // // NOTE: LoadBalancing RoundRobin
    // RoundRobinLoadBalancingSpi spi = new RoundRobinLoadBalancingSpi();
    // spi.setPerTask(true);
    // configuration.setLoadBalancingSpi(spi);
    return Ignition.start(configuration);
  }

}

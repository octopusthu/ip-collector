package com.octopusthu.net.ipcollector;

import java.net.InetAddress;

/**
 * @author ZHANG Yu
 */
public interface IpCollector {

    /**
     * Get the Internet IP address of the local machine this program is running on.
     *
     * @return inetAddress
     * @throws Exception exception
     */
    InetAddress getExternalIp() throws Exception;

}

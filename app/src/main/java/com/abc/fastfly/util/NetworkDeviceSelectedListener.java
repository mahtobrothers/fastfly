package com.abc.fastfly.util;

import com.abc.fastfly.model.NetworkDevice;

public interface NetworkDeviceSelectedListener
{
    boolean onNetworkDeviceSelected(NetworkDevice networkDevice, NetworkDevice.Connection connection);

    boolean isListenerEffective();
}

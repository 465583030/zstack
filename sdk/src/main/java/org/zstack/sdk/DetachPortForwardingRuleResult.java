package org.zstack.sdk;

import org.zstack.sdk.PortForwardingRuleInventory;

public class DetachPortForwardingRuleResult {
    public PortForwardingRuleInventory inventory;
    public void setInventory(PortForwardingRuleInventory inventory) {
        this.inventory = inventory;
    }
    public PortForwardingRuleInventory getInventory() {
        return this.inventory;
    }

}

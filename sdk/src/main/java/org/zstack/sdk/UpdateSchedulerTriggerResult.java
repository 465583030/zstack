package org.zstack.sdk;

import org.zstack.sdk.SchedulerTriggerInventory;

public class UpdateSchedulerTriggerResult {
    public SchedulerTriggerInventory inventory;
    public void setInventory(SchedulerTriggerInventory inventory) {
        this.inventory = inventory;
    }
    public SchedulerTriggerInventory getInventory() {
        return this.inventory;
    }

}

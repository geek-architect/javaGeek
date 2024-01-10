package com.geekarchitect.javageek.module002.demo02;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/1/28
 */
public class Gate {
    /**
     * 与门
     * @param lightA
     * @param lightB
     * @return
     */
    public Light andGate(Light lightA,Light lightB){
        return Light.getLightByBoolValue(lightA.isBoolValue()&&lightB.isBoolValue());
    }

    /**
     * 或门
     * @param lightA
     * @param lightB
     * @return
     */
    public Light orGate(Light lightA,Light lightB){
        return Light.getLightByBoolValue(lightA.isBoolValue()||lightB.isBoolValue());
    }
    /**
     * 非门
     * @param lightA
     * @return
     */
    public Light notGate(Light lightA){
        return Light.getLightByBoolValue(!lightA.isBoolValue());
    }
    /**
     * 与非门
     * @param lightA
     * @param lightB
     * @return
     */
    public Light andNotGate(Light lightA,Light lightB){
        return Light.getLightByBoolValue(!andGate(lightA,lightB).isBoolValue());
    }
    /**
     * 或非门
     * @param lightA
     * @param lightB
     * @return
     */
    public Light orNotGate(Light lightA,Light lightB){
        return Light.getLightByBoolValue(!orGate(lightA,lightB).isBoolValue());
    }

    /**
     * 同或门（异或非门）
     * @param lightA
     * @param lightB
     * @return
     */
    public Light andNotGate(Light lightA,Light lightB){
        return Light.getLightByBoolValue(!andGate(lightA,lightB).isBoolValue());
    }
    /**
     * 异或门
     * @param lightA
     * @param lightB
     * @return
     */
    public Light orNotGate(Light lightA,Light lightB){
        return Light.getLightByBoolValue(!orGate(lightA,lightB).isBoolValue());
    }


}

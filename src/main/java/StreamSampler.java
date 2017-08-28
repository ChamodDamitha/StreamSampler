/*
* Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* WSO2 Inc. licenses this file to you under the Apache License,
* Version 2.0 (the "License"); you may not use this file except
* in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied. See the License for the
* specific language governing permissions and limitations
* under the License.
*/

import java.util.ArrayList;

public class StreamSampler<T> {
    private double accuracy;
    private int totalNoOfHashValues;
    private int acceptedNoOfHashValues;

    private ArrayList<T> events;

    public StreamSampler(double accuracy) {
        if (accuracy >= 1 || accuracy <= 0) {
            throw new IllegalArgumentException("accuracy must be in the range of (0,1)");
        }
        this.accuracy = accuracy;

        String accuracyStr = accuracy + "";

        int decimalLength = (accuracyStr.split("\\.")[1]).length();
        int multiFactor = 1;
        for (int i = 0; i < decimalLength; i++) {
            multiFactor *= 10;
        }
        acceptedNoOfHashValues = multiFactor - (int) Math.ceil(accuracy * multiFactor);
        totalNoOfHashValues = multiFactor;

        events = new ArrayList<T>();
    }

    public boolean add(T t) {
        if (isAddable(t)) {
            events.add(t);
            return true;
        }
        return false;
    }

    private boolean isAddable(T t) {
        if (getHashValue(t) <= acceptedNoOfHashValues) {
            return true;
        }
        return false;
    }

    private int getHashValue(T t) {
        int hash = MurmurHash.hash(t);
        return hash % totalNoOfHashValues;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public ArrayList<T> getEvents() {
        return events;
    }
}

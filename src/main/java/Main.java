import java.util.Random;

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
public class Main {
    public static void main(String[] args) {


        StreamSampler streamSampler = new StreamSampler(0.50,5);

//        final int noOfEvents = 10000;
//        final double accuracy = 0.9;
//        int real_sum = 0;
//        int sample_sum = 0;
//
        Random random = new Random(120);
//
//        StreamSampler<Integer> streamSampler = new StreamSampler(accuracy);
//
//        for (int i = 0; i < noOfEvents; i++) {
////            real_sum += i;
//            real_sum += random.nextInt(10000) + 1;
//            streamSampler.add(i);
//        }
//
//        for (Integer j : streamSampler.getEvents()) {
//            sample_sum += j;
//        }
//
//
//        System.out.println("Accuracy : " + streamSampler.getAccuracy());
//        System.out.println("Stream Sampler Size : " + streamSampler.getEvents().size());
//
//
//
////      For average calculation
//        System.out.println("Real Average : " + (real_sum * 1.0 / noOfEvents));
//        double approximate_answer = (sample_sum * 1.0 / streamSampler.getEvents().size());
//
//        System.out.println("Sample Average : " + approximate_answer);
//
//        System.out.println("Confidence Interval : [" + (approximate_answer - approximate_answer * (1-accuracy)) + ", " +
//                (approximate_answer + approximate_answer * (1-accuracy)) + "]");

//        for (int i = 0; i < 100; i++) {
//            System.out.println((random.nextInt()));
//        }


    }
}

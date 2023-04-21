package com.jxx.lambda.event;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class GroupStatusHandler implements Function<GroupStatusRequest, GroupStatusResponse> {

    @Override
    public GroupStatusResponse apply(GroupStatusRequest stringRequest) {
        String groupStatus = stringRequest.getGroupStatus();

       if ("START".equals(groupStatus)) {
           return new GroupStatusResponse(true);
       }
        return new GroupStatusResponse(false);
    }
}
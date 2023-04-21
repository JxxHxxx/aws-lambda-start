package com.jxx.lambda.event;

import lombok.Getter;

@Getter
public class GroupStatusResponse {
    private boolean check;

    public GroupStatusResponse(boolean check) {
        this.check = check;
    }
}
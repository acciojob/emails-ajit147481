package com.driver;

import com.google.common.primitives.UnsignedInteger;
import org.apache.commons.lang3.tuple.Pair;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Workspace extends Gmail{

    private ArrayList<Meeting> calendar; // Stores all the meetings
    private int i=0;
    public Workspace(String emailId) {
        super();
        // The inboxCapacity is equal to the maximum value an integer can store.
    }

    public void addMeeting(Meeting meeting){
        //add the meeting to calendar
        this.calendar.add(meeting);
        i++;
    }

    public int findMaxMeetings(){
        // find the maximum number of meetings you can attend
        // 1. At a particular time, you can be present in at most one meeting
        // 2. If you want to attend a meeting, you must join it at its start time and leave at end time.
        // Example: If a meeting ends at 10:00 am, you cannot attend another meeting starting at 10:00 am
        if(calendar.isEmpty()){
            return 0;
        }
        Collections.sort(calendar,new Sortbyendtime());
        LocalTime curEndTime=calendar.get(0).getStartTime();
        int maxMeeting=1;
        for(Meeting meeting:calendar){
            if(meeting.getStartTime().compareTo(curEndTime)>0){
                maxMeeting++;
                curEndTime=meeting.getEndTime();
            }

        }
        return maxMeeting;
    }

    @java.lang.Override
    public int getInboxCapacity() {
        return Integer.MAX_VALUE;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liskovsubstitutionprinciple;

/**
 *
 * @author MERT
 */
public class SchoolStaf {

    private void makeAnnouncements() {
        System.out.println("make Announcements...");
    }

    private void takeAttendence() {
        System.out.println("took Attendence...");
    }

    private void collectPaperWork() {
        System.out.println("collected PaperWork...");
    }

    private void conductHallwayDuties() {
        System.out.println("conduct Hallway Duties...");
    }

    public void performOtherResponsiblities() {
        makeAnnouncements();
        takeAttendence();
        collectPaperWork();
        conductHallwayDuties();
    }
}

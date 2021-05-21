/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example2;

import java.util.ArrayList;

/**
 *
 * @author MERT
 */
public class ExampleTest3 {

    public static void main(String[] args) {
        Documet d = new Documet();
        d.addPage(new Page());
        d.addPage(new Page());
        d.showPages();

    }

    static class Page {

        void render() {
            System.out.println("Render");
        }
    }
    // Low Level

    void showPages() {
        for (Page page : pages) {
            page.render();

        }
    }

// High Level
    static class Documet {

        ArrayList<Page> pages = new ArrayList();

        void addPage(Page p) {
            pages.add(p);
        }

    }
}

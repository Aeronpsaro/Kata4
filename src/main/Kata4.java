/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

public class Kata4 {
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histoDisplay;
    
    private void execute() {
        input();
        process();
        output();
    }
    
    private void input() {
        mailList = MailListReader.read("email.txt");
    }
    
    private void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }
        
    private void output() {
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
    public static void main(String[] args) {
        Kata4 instance = new Kata4();
        instance.execute();
    }
    
}

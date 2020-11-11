
package kata4.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

/**
 *
 * @author José Roberto Jiménez
 */
public class Kata4 {

    
    public static void main(String[] args) {
        String fileName="email.txt";
        List<Mail> listMail = MailListReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(listMail);
        HistogramDisplay histoDisplay =new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}

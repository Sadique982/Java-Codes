import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class eligible extends JFrame{
	int fileToOpen;
	int fileToSave;
	JFileChooser fileOpen;
	JFileChooser fileSave;
	eligible(){
		MenuBar menuBar = new MenuBar();
		MenuItem menutem = new MenuItem();
		final JTextArea textArea = new JTextArea();
		setMenuBar(menuBar);
		Menu file = new Menu("File");
		menuBar.add(file);
		MenuItem newOption = new MenuItem("New Account");
		MenuItem open = new MenuItem("System Log in(Only for Manager) :");
		MenuItem save = new MenuItem("Log in Your Account ");
		MenuItem close = new MenuItem("Exit");
		file.add(newOption);
		file.add(open);
		file.add(save);
		file.add(close);
		getContentPane().add(textArea);
		
		newOption.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textArea.setText("");
			}
		});
		
		open.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				openFile();
				if (fileToOpen == JFileChooser.APPROVE_OPTION){
					textArea.setText("");
					try{
						Scanner scan = new Scanner(new FileReader(fileOpen.getSelectedFile().getPath()));
						while (scan.hasNext())
							textArea.append(scan.nextLine());
					} catch (Exception ex){
						System.out.println(ex.getMessage());
					}
				}
			}
		});
		
		save.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				saveFile();
				if (fileToSave == JFileChooser.APPROVE_OPTION){
					try {
						BufferedWriter out = new BufferedWriter(new FileWriter(fileSave.getSelectedFile().getPath()));
						out.write(textArea.getText());
						out.close();
					} catch (Exception ex) {
						System.out.println(ex.getMessage());
					}
				}
			}
		});
		
		close.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
	}
	
	public void openFile(){
		JFileChooser open = new JFileChooser();
		int option = open.showOpenDialog(this);
		fileToOpen = option;
		fileOpen = open;
	}
	
	public void saveFile(){
		JFileChooser save = new JFileChooser();
		int option = save.showOpenDialog(this);
		fileToSave = option;
		fileSave = save;
	}
	
	
	
public static void main(String args[]){
		JFrame frame = new eligible();
		frame.setTitle("ST. MARY\'s BANK");
		frame.setVisible(true);
		frame.setSize(1366, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
	}
}
package ee;
import java.sql.*;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import swing2swt.layout.BoxLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.events.MouseMoveListener;
import java.sql.*;

public class rr {

	protected Shell shlEnigma;
	private Text txtKot;
	private Text txtSzyfr;
	private Text txtTutaj;
	private Text User;
	private Text pkt;
	private Text text;
	private Text rozsz1;
	private Text rozsz2;
	volatile int pobr_i=1;
	volatile int spr_i=1;
	volatile int szyfr_i=2;
	volatile int punkt=0;
	volatile  int user_i=1;
	/**
	 * Launch the application.
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		try {
			rr window = new rr();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


private Text label;

	

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlEnigma.open();
		shlEnigma.layout();
		while (!shlEnigma.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlEnigma = new Shell();
		shlEnigma.setBackground(SWTResourceManager.getColor(0, 0, 0));
		shlEnigma.setImage(SWTResourceManager.getImage(".//przyciski//kungfu-Minion.png"));
		shlEnigma.setSize(467, 617);
		shlEnigma.setText("@ :) @");
		shlEnigma.setLayout(new FormLayout());
		
		TabFolder tabFolder = new TabFolder(shlEnigma, SWT.NONE);
		tabFolder.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		tabFolder.setBackground(SWTResourceManager.getColor(255, 255, 255));
		FormData fd_tabFolder = new FormData();
		fd_tabFolder.top = new FormAttachment(0);
		fd_tabFolder.left = new FormAttachment(0);
		fd_tabFolder.right = new FormAttachment(0, 460);
		fd_tabFolder.bottom = new FormAttachment(100);
		tabFolder.setLayoutData(fd_tabFolder);
		
		TabItem tbtmSzyfrowanie_1 = new TabItem(tabFolder, SWT.NONE);
		tbtmSzyfrowanie_1.setImage(SWTResourceManager.getImage(".//przyciski//despicable-me-2-Minion-icon-3.png"));
		tbtmSzyfrowanie_1.setText("Szyfrowanie");
		
		Canvas canvas_2 = new Canvas(tabFolder, SWT.NONE);
		canvas_2.setBackground(SWTResourceManager.getColor(253, 245, 230));
		tbtmSzyfrowanie_1.setControl(canvas_2);
		
		Button button = new Button(canvas_2, SWT.NONE);
		button.addMouseListener(new MouseAdapter() {
			
			public void mouseDown(MouseEvent e) {
					
					 if (txtKot.getText()=="0")
					{
						txtKot.setText("1");
					}
					else txtKot.setText(txtKot.getText()+"1");

			}
		});
		button.setImage(SWTResourceManager.getImage(".//przyciski//przyciski_03.gif"));
		button.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button.setFont(SWTResourceManager.getFont("Tekton Pro Cond", 12, SWT.NORMAL));
		button.setBounds(76, 45, 68, 81);
		
		Button button_2 = new Button(canvas_2, SWT.NONE);
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				 if (txtKot.getText()=="0")
					{
						txtKot.setText("3");
					}
					else txtKot.setText(txtKot.getText()+"3");}
		});
		button_2.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_2.setImage(SWTResourceManager.getImage(".//przyciski//przyciski_05.gif"));
		button_2.setFont(SWTResourceManager.getFont("Tekton Pro Cond", 12, SWT.NORMAL));
		button_2.setBounds(224, 45, 68, 81);
		
		Button button_3 = new Button(canvas_2, SWT.NONE);
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				 if (txtKot.getText()=="0")
					{
						txtKot.setText("4");
					}
					else txtKot.setText(txtKot.getText()+"4");
			}
		});
		button_3.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_3.setImage(SWTResourceManager.getImage(".//przyciski//przyciski_06.gif"));
		button_3.setFont(SWTResourceManager.getFont("Tekton Pro Cond", 12, SWT.NORMAL));
		button_3.setBounds(298, 45, 68, 81);
		
		Button button_4 = new Button(canvas_2, SWT.NONE);
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				 if (txtKot.getText()=="0")
					{
						txtKot.setText("5");
					}
					else txtKot.setText(txtKot.getText()+"5");
			}
		});
		button_4.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_4.setImage(SWTResourceManager.getImage(".//przyciski//przyciski_08.gif"));
		button_4.setFont(SWTResourceManager.getFont("Tekton Pro Cond", 12, SWT.NORMAL));
		button_4.setBounds(76, 134, 68, 81);
		
		Button button_5 = new Button(canvas_2, SWT.NONE);
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				 if (txtKot.getText()=="0")
					{
						txtKot.setText("6");
					}
					else txtKot.setText(txtKot.getText()+"6");
			}
		});
		button_5.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_5.setImage(SWTResourceManager.getImage(".//przyciski//przyciski_09.gif"));
		button_5.setFont(SWTResourceManager.getFont("Tekton Pro Cond", 12, SWT.NORMAL));
		button_5.setBounds(150, 134, 68, 81);
		
		Button button_6 = new Button(canvas_2, SWT.NONE);
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				 if (txtKot.getText()=="0")
					{
						txtKot.setText("7");
					}
					else txtKot.setText(txtKot.getText()+"7");
			}
		});
		button_6.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_6.setImage(SWTResourceManager.getImage(".//przyciski//przyciski_10.gif"));
		button_6.setFont(SWTResourceManager.getFont("Tekton Pro Cond", 12, SWT.NORMAL));
		button_6.setBounds(224, 134, 68, 82);
		
		Button button_7 = new Button(canvas_2, SWT.NONE);
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				 if (txtKot.getText()=="0")
					{
						txtKot.setText("8");
					}
					else txtKot.setText(txtKot.getText()+"8");
			}
		});
		button_7.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_7.setImage(SWTResourceManager.getImage(".//przyciski//przyciski_11.gif"));
		button_7.setFont(SWTResourceManager.getFont("Tekton Pro Cond", 12, SWT.NORMAL));
		button_7.setBounds(298, 134, 68, 81);
		
		Button button_8 = new Button(canvas_2, SWT.NONE);
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				 if (txtKot.getText()=="0")
					{
						txtKot.setText("9");
					}
					else txtKot.setText(txtKot.getText()+"9");
			}
		});
		button_8.setImage(SWTResourceManager.getImage(".//przyciski//przyciski_12.gif"));
		button_8.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_8.setFont(SWTResourceManager.getFont("Tekton Pro Cond", 12, SWT.NORMAL));
		button_8.setBounds(76, 221, 68, 81);
		
		Button button_9 = new Button(canvas_2, SWT.NONE);
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				 if (txtKot.getText()=="0")
					{
						txtKot.setText("#");
					}
					else txtKot.setText(txtKot.getText()+"#");
			}
		});
		button_9.setImage(SWTResourceManager.getImage(".//przyciski//przyciski_14.gif"));
		button_9.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_9.setFont(SWTResourceManager.getFont("Tekton Pro Cond", 12, SWT.NORMAL));
		button_9.setBounds(224, 222, 68, 81);
		
		Button button_10 = new Button(canvas_2, SWT.NONE);
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				 if (txtKot.getText()=="0") //wyjatek
					{
						txtKot.setText("0");
					}
					else txtKot.setText(txtKot.getText()+"0");
			}
		});
		button_10.setImage(SWTResourceManager.getImage(".//przyciski//przyciski_13.gif"));
		button_10.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_10.setFont(SWTResourceManager.getFont("Tekton Pro Cond", 12, SWT.NORMAL));
		button_10.setBounds(150, 221, 68, 81);
		
		Button button_11 = new Button(canvas_2, SWT.NONE);
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				 if (txtKot.getText()=="0")
					{
						txtKot.setText("@");
					}
					else txtKot.setText(txtKot.getText()+"@");
			}
		});
		button_11.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_11.setImage(SWTResourceManager.getImage(".//przyciski//przyciski_15.gif"));
		button_11.setFont(SWTResourceManager.getFont("Tekton Pro Cond", 12, SWT.NORMAL));
		button_11.setBounds(298, 222, 68, 79);
		
		Button button_1 = new Button(canvas_2, SWT.NONE);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				 if (txtKot.getText()=="0")
					{
						txtKot.setText("2");
					}
					else txtKot.setText(txtKot.getText()+"2");
			}
		});
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_1.setImage(SWTResourceManager.getImage(".//przyciski//przyciski_04.gif"));
		button_1.setFont(SWTResourceManager.getFont("Tekton Pro Cond", 12, SWT.NORMAL));
		button_1.setBounds(150, 45, 68, 81);
		
		txtKot = new Text(canvas_2, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.CENTER | SWT.MULTI);
		txtKot.setFont(SWTResourceManager.getFont("Tekton Pro Ext", 14, SWT.NORMAL));
		txtKot.setBounds(76, 369, 241, 81);
		
		TabItem tbtmOdszyfrowanie = new TabItem(tabFolder, SWT.NONE);
		tbtmOdszyfrowanie.setImage(SWTResourceManager.getImage(".//przyciski//Shy-Minion-icon.png"));
		tbtmOdszyfrowanie.setText("Odszyfrowanie");
		
		Canvas canvas_1 = new Canvas(tabFolder, SWT.NONE);
		canvas_1.setToolTipText("a");
		canvas_1.setBackground(SWTResourceManager.getColor(250, 235, 215));
		tbtmOdszyfrowanie.setControl(canvas_1);
		
		txtSzyfr = new Text(canvas_1, SWT.BORDER);
		txtSzyfr.setFont(SWTResourceManager.getFont("Tekton Pro Cond", 22, SWT.NORMAL));
		txtSzyfr.setBounds(58, 177, 316, 48);
		
		User = new Text(canvas_1, SWT.BORDER);
		User.setFont(SWTResourceManager.getFont("Segoe Print", 11, SWT.BOLD));
		User.setText("Nazwa u\u017Cytkownika");
		User.setBounds(142, 56, 187, 41);
		
		pkt = new Text(canvas_1, SWT.BORDER);
		pkt.setFont(SWTResourceManager.getFont("Segoe Print", 11, SWT.BOLD));
		pkt.setText("0");
		pkt.setBounds(335, 56, 39, 41);
		
		text = new Text(canvas_1, SWT.BORDER);
		text.setFont(SWTResourceManager.getFont("Tekton Pro Cond", 20, SWT.NORMAL));
		text.setBounds(58, 296, 316, 48);
		
		rozsz1 = new Text(canvas_1, SWT.BORDER);
		rozsz1.setFont(SWTResourceManager.getFont("Segoe Script", 12, SWT.NORMAL));
		rozsz1.setBounds(58, 229, 316, 30);
		
		rozsz2 = new Text(canvas_1, SWT.BORDER);
		rozsz2.setFont(SWTResourceManager.getFont("Segoe Script", 12, SWT.NORMAL));
		rozsz2.setBounds(58, 349, 316, 30);
		
		Button btnNewButton_1 = new Button(canvas_1, SWT.NONE);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) { //przycisk sprawdŸ
				
				String pobrany;
				ResultSet result=null;
			    String ID_Kodu;
			    String Kod=" ";
			    String Tekst=" ";
			    int punkt;
			    
				
					String DBURL = "jdbc:mysql://localhost/szyfr";
					String DBUSER = "root";
					String DBPASS = "Odserca5233";
					String DBDRIVER = "com.mysql.jdbc.Driver";
					 
					//OBIEKT TWORZ¥CY PO£¥CZENIE Z BAZ¥ DANYCH.
					Connection connection;
					//OBIEKT POZWALAJ¥CY TWORZYÆ NOWE WYRA¯ENIA SQL
					Statement statement;
					//ZAPYTANIE SQL
					   
					String zapytanie="SELECT * FROM kody WHERE ID_Kodu="+spr_i+"";
					// System.out.println(zapytanie);
					String query=zapytanie;
					 
					        try {
					            Class.forName(DBDRIVER).newInstance();
					            connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
					            statement = connection.createStatement();
					           result= statement.executeQuery(query);
					            
					          
					       while ( result.next() ) 
					           { 
					           ID_Kodu = result.getString("ID_Kodu");
					           Kod=result.getString("Kod");
					           Tekst=result.getString("Tekst");
					           
					           //System.out.println(ID_Kodu+" . "+Kod+"."+Tekst); 
					           
					            } 

					      //pobrany=Kod;
					      txtSzyfr.setText(Kod);
							int dl;
							dl=txtSzyfr.getText().length();
							String dlu;
							dlu=String.valueOf(dl);
			
						
								
								if (rozsz2.getText()==" ")
								{
									pobrany=rozsz1.getText();
								
								}
								else pobrany=rozsz1.getText()+rozsz2.getText();
								
								System.out.println(Tekst);
								System.out.println(pobrany);
								if (Tekst.equals(pobrany))
					            {
									punkt=Integer.valueOf(pkt.getText());
									punkt++;
					            	pkt.setText(String.valueOf(punkt));
					            	
					            }
								result.close(); 
								spr_i++;
								
						           statement.close();
						           connection.close();
						        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ss) {
						            // TODO AUTO-GENERATED CATCH BLOCK
						            ss.printStackTrace();
						        }
				
		}
		});
		btnNewButton_1.setImage(SWTResourceManager.getImage(".//przyciski//przyciski_23.gif"));
		btnNewButton_1.setBounds(147, 420, 135, 49);
		
		Button btnNewButton_2 = new Button(canvas_1, SWT.NONE);
		btnNewButton_2.addMouseListener(new MouseAdapter() { //przycisk pobierz
			@Override
			public void mouseDown(MouseEvent e) {
			int i=1;
			String pobrany;
			ResultSet result=null;
		    String ID_Kodu;
		    String Kod=" ";
		    String Tekst=" ";
		    
			i=1;
				String DBURL = "jdbc:mysql://localhost/szyfr";
				String DBUSER = "root";
				String DBPASS = "Odserca5233";
				String DBDRIVER = "com.mysql.jdbc.Driver";
				 
				    //OBIEKT TWORZ¥CY PO£¥CZENIE Z BAZ¥ DANYCH.
				    Connection connection;
				    //OBIEKT POZWALAJ¥CY TWORZYÆ NOWE WYRA¯ENIA SQL
				   Statement statement;
				    //ZAPYTANIE SQL
				   
				    String zapytanie="SELECT * FROM kody WHERE ID_Kodu="+pobr_i+"";
				   // System.out.println(zapytanie);
				    String query=zapytanie;
				    
				    
				 
				        try {
				            Class.forName(DBDRIVER).newInstance();
				            connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
				            statement = connection.createStatement();
				           result= statement.executeQuery(query);
				            
				          
				       while ( result.next() ) 
				           { 
				           ID_Kodu = result.getString("ID_Kodu");
				           Kod=result.getString("Kod");
				           Tekst=result.getString("Tekst");
				           
				           //System.out.println(ID_Kodu+" . "+Kod+"."+Tekst); 
				           
				            } 
				       i++;
				      //pobrany=Kod;
				      txtSzyfr.setText(Kod);
						int dl;
						dl=txtSzyfr.getText().length();
						//char[] tab = txtSzyfr.getText().toCharArray();
						String dlu;
						dlu=String.valueOf(dl);
						//pkt.setText(dlu);				
					
							if (dl>20)
							{
								txtSzyfr.setText(Kod.substring(0, 19));	
							 	text.setText(Kod.substring(21, dl));
							} else txtSzyfr.setText(Kod);
							/*if (rozsz2.getText()==" ")
							{
							pobrany=rozsz1.getText()+rozsz2.getText();
							}
							else pobrany=rozsz1.getText();
							
							
							if (Tekst==pobrany)
				            {
				            	pkt.setText("kocha");
				            	
				            }*/
				            
				            
				                        //ZWOLNIENIE ZASOBÓW I ZAMKNIÊCIE PO£¥CZENIA
				            result.close(); 
				            pobr_i++;
				           statement.close();
				           connection.close();
				        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ss) {
				            // TODO AUTO-GENERATED CATCH BLOCK
				            ss.printStackTrace();
				        }
			}			
		
			});
		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_2.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent arg0) {
				txtKot.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(58, 130, 75, 41);
		btnNewButton_2.setText("pobierz");
		
		Button user = new Button(canvas_1, SWT.NONE);
		user.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {//u¿ytkownik
				User.getText(); 
				ResultSet result=null;
									//przeszukanie bazy danych wq poszukiwaniu uzytkownika
				
				String DBURL = "jdbc:mysql://localhost/szyfr";
				String DBUSER = "root";
				String DBPASS = "Odserca5233";
				String DBDRIVER = "com.mysql.jdbc.Driver";
				String Login=" ";
				 String kotek=" ";
				 String pkty;
				    //OBIEKT TWORZ¥CY PO£¥CZENIE Z BAZ¥ DANYCH.
				    Connection connection;
				    //OBIEKT POZWALAJ¥CY TWORZYÆ NOWE WYRA¯ENIA SQL
				   Statement statement;
				    //ZAPYTANIE SQL
				 
				  //  String zapytanie="SELECT * FROM ranking where login="+User.getText()+"";
				   String zapytanie="SELECT LOGIN FROM ranking";
				    //   System.out.println(zapytanie);
				    String query=zapytanie;
				   // JOptionPane.showMessageDialog(frame,"Eggs are not supposed to be green.");
				        try {
				            Class.forName(DBDRIVER).newInstance();
				            connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
				            statement = connection.createStatement();
				            result=statement.executeQuery(query);
				           
				            while ( result.next() ) 
					           { 
				            	Login=result.getString("LOGIN");
				            	pkty=result.getString("PUNKTY");
				            				           
					            }
				            
				            if (User.getText().equals(Login))
				            {
					           label.setText("U¿ytkownik o takiej nazwie ju¿ istnieje");
				            } else {
				            	query="INSERT into ranking values ("+user_i+",'"+User.getText()+"','"+pkt.getText()+"')";
				            	
				            	 
							            statement = connection.createStatement();
							            statement.executeUpdate(query);
				            	
				            }
				            //	System.out.println(kotek);
				                        //ZWOLNIENIE ZASOBÓW I ZAMKNIÊCIE PO£¥CZENIA
				           result.close(); 
				           statement.close();
				           connection.close();
				        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException k)
				        {
				            // TODO AUTO-GENERATED CATCH BLOCK
				            k.printStackTrace();
				        }
		
		}
	});
		user.setBounds(58, 56, 75, 25);
		user.setText("us");
		
		label = new Text(canvas_1, SWT.BORDER | SWT.CENTER);
		label.setEditable(false);
		label.setFont(SWTResourceManager.getFont("Segoe UI", 7, SWT.NORMAL));
		label.setText("Wprowad\u017A u\u017Cytkownika");
		label.setBounds(142, 103, 187, 18);
		
		Button btnNewButton = new Button(canvas_2, SWT.NONE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) { //przycisk szyfruj
				
			/*	txtSzyfr.setText(txtKot.getText());
				int dl;
				dl=txtSzyfr.getText().length();
				//char[] tab = txtSzyfr.getText().toCharArray();
				String dlu;
				dlu=String.valueOf(dl);
				//pkt.setText(dlu);				
			
					if (dl>20)
					{
						txtSzyfr.setText(txtKot.getText().substring(0, 19));	
					 	text.setText(txtKot.getText().substring(21, dl));
					} else txtSzyfr.setText(txtKot.getText());*/
					
					String DBURL = "jdbc:mysql://localhost/szyfr";
					String DBUSER = "root";
					String DBPASS = "Odserca5233";
					String DBDRIVER = "com.mysql.jdbc.Driver";
					 int i=3;
					    //OBIEKT TWORZ¥CY PO£¥CZENIE Z BAZ¥ DANYCH.
					    Connection connection;
					    //OBIEKT POZWALAJ¥CY TWORZYÆ NOWE WYRA¯ENIA SQL
					   Statement statement;
					    //ZAPYTANIE SQL
					   i++;
					    String zapytanie="INSERT into kody values ('"+szyfr_i+"','"+txtKot.getText()+"','"+txtTutaj.getText()+"')";
					 //   System.out.println(zapytanie);
					    String query=zapytanie;
					 
					        try {
					            Class.forName(DBDRIVER).newInstance();
					            connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
					            statement = connection.createStatement();
					            statement.executeUpdate(query);
					 
					                        //ZWOLNIENIE ZASOBÓW I ZAMKNIÊCIE PO£¥CZENIA
					           statement.close();
					           connection.close();
					        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException k)
					        {
					            // TODO AUTO-GENERATED CATCH BLOCK
					            k.printStackTrace();
					        }
								
			
			}
		});
		btnNewButton.setImage(SWTResourceManager.getImage(".//przyciski//przyciski_17.gif"));
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setFont(SWTResourceManager.getFont("Tekton Pro Cond", 12, SWT.BOLD));
		btnNewButton.setBounds(150, 456, 136, 49);
		
		txtTutaj = new Text(canvas_2, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		txtTutaj.setText("Tutaj wpisz szyfrowany tekst");
		txtTutaj.setBounds(76, 319, 241, 37);
		
		Button btnX = new Button(canvas_2, SWT.NONE);
		btnX.setImage(SWTResourceManager.getImage(".//przyciski//przyciski_19.gif"));
		btnX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				txtTutaj.setText(" ");
			}
		});
		btnX.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnX.setFont(SWTResourceManager.getFont("Tekton Pro Ext", 12, SWT.BOLD));
		btnX.setBounds(323, 319, 55, 49);
		
		Button btnX_1 = new Button(canvas_2, SWT.NONE);
		btnX_1.setImage(SWTResourceManager.getImage(".//przyciski//przyciski_19.gif"));
		btnX_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				txtKot.setText(" ");
			}
		});
		btnX_1.setFont(SWTResourceManager.getFont("Tekton Pro Ext", 12, SWT.BOLD));
		btnX_1.setBounds(323, 386, 55, 49);
		
		
		
		
	
		
		
		
	}
}

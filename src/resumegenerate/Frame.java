package resumegenerate;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;


public class Frame extends JFrame {

    JLabel fName , lName , lProf , Address ,Phone , Email , DOB, Position , Company , FDate , TDate ,
            Experience , SchoolingFrom , Ten_Marks , ten_passing , twel_Marks ,twel_passing , CollegeFrom
            , Course , CGPA , Skills , skill1 , skill1Star , skill2 , skill2Star , skill3 , skill3Star
            , skill4 , skill4Star , skill5 , skill5Star ,skill6 , skill6Star;


    JTextField tffname,tflname,tfProf,tfEmail,tfAddress, tfPhone ,tfDOB, tfPosition , tfCompany , tfCourse ,tfCGPA ,
            tfFDate ,tfTDate , tfExperience , tfSchoolingFrom , tfTen_Marks , tften_passing ,tftwel_Marks , tftwel_passing
            ,tfCollegeFrom ,tfskill1 , tfskill1Star , tfskill2 ,tfskill2Star ,tfskill3 , tfskill3Star , tfskill4 , tfskill4Star
            ,tfskill5 , tfskill5Star , tfsummary , tfskill6 ,tfskill6Star;
    JTable jt;

    Frame(){

        super("Resume Generator By Moon Sharma and Arshdeep Kaur");
        setLayout(null);


        JLabel heading = new JLabel("Resume Generator");
        heading.setBounds(60,5,300,50);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        add(heading);


        // personalinfo

        JLabel personalinfo = new JLabel("Personal Information :");
        personalinfo.setBounds(25,75,300,30);
        personalinfo.setFont(new Font("Tahoma",Font.BOLD,18));
        add(personalinfo);

        fName = new JLabel("First Name");
        fName.setBounds(30,115,90,30);
        fName.setFont(new Font("Tahoma",Font.BOLD,12));
        add(fName);
        tffname = new JTextField();
        tffname.setBounds(110,122,100, 20);
        add(tffname);

        lName = new JLabel("Last Name");
        lName.setBounds(260,115,90,30);
        lName.setFont(new Font("Tahoma",Font.BOLD,12));
        add(lName);
        tflname = new JTextField();
        tflname.setBounds(330,122,100, 20);
        add(tflname);

        lProf = new JLabel("Profession");
        lProf.setBounds(30,155,90,30);
        lProf.setFont(new Font("Tahoma",Font.BOLD,12));
        add(lProf);
        tfProf = new JTextField();
        tfProf.setBounds(110,160,320, 20);
        add(tfProf);

        Address= new JLabel("Address");
        Address.setBounds(30,190,90,30);
        Address.setFont(new Font("Tahoma",Font.BOLD,12));
        add(Address);
        tfAddress = new JTextField();
        tfAddress.setBounds(110,195,320, 20);
        add(tfAddress);

        Phone = new JLabel("Phone No.");
        Phone.setBounds(30,225,90,30);
        Phone.setFont(new Font("Tahoma",Font.BOLD,12));
        add(Phone);
        tfPhone = new JTextField();
        tfPhone.setBounds(110,225,100, 20);
        add(tfPhone);

        DOB = new JLabel("DOB");
        DOB.setBounds(280,218,90,30);
        DOB.setFont(new Font("Tahoma",Font.BOLD,12));
        add(DOB);
        tfDOB = new JTextField();
        tfDOB.setBounds(330,225,100, 20);
        add(tfDOB);

        Email= new JLabel("Email");
        Email.setBounds(30,255,90,30);
        Email.setFont(new Font("Tahoma",Font.BOLD,12));
        add(Email);
        tfEmail = new JTextField();
        tfEmail.setBounds(110,260,320, 20);
        add(tfEmail);

        // Experience Screen

        JLabel experience = new JLabel("Add Experience :");
        experience.setBounds(25,290,300,30);
        experience.setFont(new Font("Tahoma",Font.BOLD,18));
        add(experience);

        Position = new JLabel("Position");
        Position.setBounds(30,320,90,30);
        Position.setFont(new Font("Tahoma",Font.BOLD,12));
        add(Position);
        tfPosition = new JTextField();
        tfPosition.setBounds(110,330,320, 20);
        add(tfPosition);

        Company = new JLabel("Company");
        Company.setBounds(30,360,90,30);
        Company.setFont(new Font("Tahoma",Font.BOLD,12));
        add(Company);
        tfCompany = new JTextField();
        tfCompany.setBounds(110,370,320, 20);
        add(tfCompany);

        FDate = new JLabel("Date From");
        FDate.setBounds(30,400,90,30);
        FDate.setFont(new Font("Tahoma",Font.BOLD,12));
        add(FDate);
        tfFDate = new JTextField();
        tfFDate.setBounds(110,410,100, 20);
        add(tfFDate);

        TDate = new JLabel("Date To");
        TDate.setBounds(260,400,90,30);
        TDate.setFont(new Font("Tahoma",Font.BOLD,12));
        add(TDate);
        tfTDate = new JTextField();
        tfTDate.setBounds(330,410,100, 20);
        add(tfTDate);

        Experience = new JLabel("Experience");
        Experience.setBounds(30,440,90,30);
        Experience.setFont(new Font("Tahoma",Font.BOLD,12));
        add(Experience);
        tfExperience =  new JTextField();
        tfExperience.setBounds(110,440,320, 60);
        add(tfExperience);

        // Education Screen

        JLabel Educationscreen = new JLabel("Add Education :");
        Educationscreen.setBounds(25,510,300,30);
        Educationscreen.setFont(new Font("Tahoma",Font.BOLD,18));
        add(Educationscreen);

        SchoolingFrom = new JLabel("School From");
        SchoolingFrom.setBounds(30,560,90,30);
        SchoolingFrom.setFont(new Font("Tahoma",Font.BOLD,12));
        add(SchoolingFrom);
        tfSchoolingFrom = new JTextField();
        tfSchoolingFrom.setBounds(110,570,320, 20);
        add(tfSchoolingFrom);

        Ten_Marks = new JLabel("10th Marks");
        Ten_Marks.setBounds(30,600,90,30);
        Ten_Marks.setFont(new Font("Tahoma",Font.BOLD,12));
        add(Ten_Marks);
        tfTen_Marks = new JTextField();
        tfTen_Marks.setBounds(110,610,100, 20);
        add(tfTen_Marks);

        ten_passing = new JLabel("Passing Year");
        ten_passing .setBounds(240,600,90,30);
        ten_passing .setFont(new Font("Tahoma",Font.BOLD,12));
        add(ten_passing );
        tften_passing  = new JTextField();
        tften_passing.setBounds(330,610,100, 20);
        add(tften_passing);

        twel_Marks = new JLabel("12th Marks");
        twel_Marks.setBounds(30,640,90,30);
        twel_Marks.setFont(new Font("Tahoma",Font.BOLD,12));
        add(twel_Marks);
        tftwel_Marks = new JTextField();
        tftwel_Marks.setBounds(110,650,100, 20);
        add(tftwel_Marks);

        twel_passing = new JLabel("Passing Year");
        twel_passing .setBounds(240,640,90,30);
        twel_passing.setFont(new Font("Tahoma",Font.BOLD,12));
        add(twel_passing );
        tftwel_passing  = new JTextField();
        tftwel_passing.setBounds(330,650,100, 20);
        add(tftwel_passing);


        CollegeFrom = new JLabel("College From");
        CollegeFrom.setBounds(30,680,90,30);
        CollegeFrom.setFont(new Font("Tahoma",Font.BOLD,12));
        add(CollegeFrom);
        tfCollegeFrom = new JTextField();
        tfCollegeFrom.setBounds(110,690,320, 20);
        add(tfCollegeFrom);

        Course = new JLabel("Course");
        Course.setBounds(30,720,90,30);
        Course.setFont(new Font("Tahoma",Font.BOLD,12));
        add(Course);
        tfCourse = new JTextField();
        tfCourse.setBounds(110,730,100, 20);
        add(tfCourse);

        CGPA= new JLabel("Current CGPA");
        CGPA.setBounds(240,720,90,30);
        CGPA.setFont(new Font("Tahoma",Font.BOLD,12));
        add(CGPA );
        tfCGPA  = new JTextField();
        tfCGPA.setBounds(330,730,100, 20);
        add(tfCGPA);

        // Skill Set

        JLabel skillset = new JLabel("Skill Set :");
        skillset.setBounds(500,75,300,30);
        skillset.setFont(new Font("Tahoma",Font.BOLD,18));
        add(skillset);

        Skills = new JLabel("Add Your Top 5 Skills");
        Skills.setBounds(520,115,150,30);
        Skills.setFont(new Font("Tahoma",Font.BOLD,12));
        add(Skills);

        skill1 = new JLabel("Skill 1");
        skill1.setBounds(520,155,150,30);
        skill1.setFont(new Font("Tahoma",Font.BOLD,12));
        add(skill1);

        tfskill1 = new JTextField();
        tfskill1.setBounds(580,160,100, 20);
        add(tfskill1);

        skill1Star = new JLabel("Skill 1 Rating From 5");
        skill1Star.setBounds(690,155,150,30);
        skill1Star.setFont(new Font("Tahoma",Font.BOLD,12));
        add(skill1Star);

        tfskill1Star = new JTextField();
        tfskill1Star.setBounds(830,160,100, 20);
        add(tfskill1Star);

        // skill 2

        skill2 = new JLabel("Skill 2");
        skill2.setBounds(520,190,150,30);
        skill2.setFont(new Font("Tahoma",Font.BOLD,12));
        add(skill2);

        tfskill2 = new JTextField();
        tfskill2.setBounds(580,195,100, 20);
        add(tfskill2);

        skill2Star = new JLabel("Skill 2 Rating From 5");
        skill2Star.setBounds(690,190,150,30);
        skill2Star.setFont(new Font("Tahoma",Font.BOLD,12));
        add(skill2Star);

        tfskill2Star = new JTextField();
        tfskill2Star.setBounds(830,195,100, 20);
        add(tfskill2Star);

        // skill 3

        skill3 = new JLabel("Skill 3");
        skill3.setBounds(520,225,150,30);
        skill3.setFont(new Font("Tahoma",Font.BOLD,12));
        add(skill3);

        tfskill3 = new JTextField();
        tfskill3.setBounds(580,230,100, 20);
        add(tfskill3);

        skill3Star = new JLabel("Skill 3 Rating From 5");
        skill3Star.setBounds(690,225,150,30);
        skill3Star.setFont(new Font("Tahoma",Font.BOLD,12));
        add(skill3Star);

        tfskill3Star = new JTextField();
        tfskill3Star.setBounds(830,230,100, 20);
        add(tfskill3Star);

        // skill 4

        skill4 = new JLabel("Skill 4");
        skill4.setBounds(520,260,150,30);
        skill4.setFont(new Font("Tahoma",Font.BOLD,12));
        add(skill4);

        tfskill4 = new JTextField();
        tfskill4.setBounds(580,265,100, 20);
        add(tfskill4);

        skill4Star = new JLabel("Skill 1 Rating From 5");
        skill4Star.setBounds(690,260,150,30);
        skill4Star.setFont(new Font("Tahoma",Font.BOLD,12));
        add(skill4Star);

        tfskill4Star = new JTextField();
        tfskill4Star.setBounds(830,265,100, 20);
        add(tfskill4Star);

        //skill 5

        skill5 = new JLabel("Skill 5");
        skill5.setBounds(520,290,150,30);
        skill5.setFont(new Font("Tahoma",Font.BOLD,12));
        add(skill5);

        tfskill5 = new JTextField();
        tfskill5.setBounds(580,295,100, 20);
        add(tfskill5);

        skill5Star = new JLabel("Skill 5 Rating From 5");
        skill5Star.setBounds(690,290,150,30);
        skill5Star.setFont(new Font("Tahoma",Font.BOLD,12));
        add(skill5Star);

        tfskill5Star = new JTextField();
        tfskill5Star.setBounds(830,295,100, 20);
        add(tfskill5Star);

        skill6 = new JLabel("Skill 6");
        skill6.setBounds(520,330,150,30);
        skill6.setFont(new Font("Tahoma",Font.BOLD,12));
        add(skill6);

        tfskill6 = new JTextField();
        tfskill6.setBounds(580,335,100, 20);
        add(tfskill6);

        skill6Star = new JLabel("Skill 6 Rating From 5");
        skill6Star.setBounds(690,330,150,30);
        skill6Star.setFont(new Font("Tahoma",Font.BOLD,12));
        add(skill6Star);

        tfskill6Star = new JTextField();
        tfskill6Star.setBounds(830,335,100, 20);
        add(tfskill6Star);


        // Summary

        JLabel summary = new JLabel("Summary :");
        summary.setBounds(500,375,300,30);
        summary.setFont(new Font("Tahoma",Font.BOLD,18));
        add(summary);

        tfsummary = new JTextField();
        tfsummary.setBounds(520,420,420, 200);
        add(tfsummary);





        JButton Submit = new JButton("Submit");
        Submit.setBounds(840,640,100,50);
        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Fname = tffname.getText();
                String Lname = tflname.getText();
                String lprof = tfProf.getText();
                String Email = tfEmail.getText();
                String address = tfAddress.getText();
                String phone = tfPhone.getText();
                String Dob = tfDOB.getText();

                String Position = tfPosition.getText();
                String Company = tfCompany.getText();
                String Fdate = tfFDate.getText();
                String Tdate = tfTDate.getText();
                String Experience = tfExperience.getText();

                String SchoolFrom = tfSchoolingFrom.getText();
                String tenmarks = tfTen_Marks.getText();
                String tenpass = tften_passing.getText();
                String twelmarks = tftwel_Marks.getText();
                String twelpass = tftwel_passing.getText();
                String Collegefrom = tfCollegeFrom.getText();
                String course = tfCourse.getText();
                String cgpa = tfCGPA.getText();


                String s1 = tfskill1.getText();
                String s2 = tfskill2.getText();
                String s3 = tfskill3.getText();
                String s4 = tfskill4.getText();
                String s5 = tfskill5.getText();
                String s6 = tfskill6.getText();
                String st1 = tfskill1Star.getText();
                String st2 = tfskill2Star.getText();
                String st3 = tfskill3Star.getText();
                String st4 = tfskill4Star.getText();
                String st5 = tfskill5Star.getText();
                String st6 = tfskill6Star.getText();

                String summayh = tfsummary.getText();


                String path = "E:\\";
                com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
                try {

                    PdfWriter.getInstance(doc , new FileOutputStream(path + "" + Fname +""+".pdf"));
                    doc.open();

                    Paragraph paragraph0 = new Paragraph("                                                                      RESUME "+"\n"+"                                                                 ---------------------"+"\n\n");
                    doc.add(paragraph0);

                    Paragraph paragraph1 = new Paragraph("Personal Information --------------------------------------------------------------------------------------------- "+"\n\n");
                    doc.add(paragraph1);
                    Paragraph paragraph2 = new Paragraph("      Name : "+Fname+" "+ Lname+"\n      Profession: " +lprof+"\n      Address : "+address+"\n      Contact No "+ phone+"\n      Email : "+Email+"\n      DOB : "+Dob+"\n\n");
                    doc.add(paragraph2);

                    Paragraph paragraph3 = new Paragraph("Experience Screen ------------------------------------------------------------------------------------------------ "+"\n\n");
                    doc.add(paragraph3);
                    Paragraph paragraph4 = new Paragraph("      Position :"+Position+"\n      Company:"+ Company+"\n      Date (From):"+Fdate+"\n      Date (To)"+ Tdate+"\n      Experience : "+Experience+"\n\n");
                    doc.add(paragraph4);



                    Paragraph paragraph5 = new Paragraph("Education Screen --------------------------------------------------------------------------------------------------- "+"\n\n");
                    doc.add(paragraph5);

                    PdfPTable tbl = new PdfPTable(2);
                    tbl.addCell("                   Schooling From : ");;
                    tbl.addCell("   "+SchoolFrom+",\n                        ");
                    doc.add(tbl);

                    PdfPTable tbl2 = new PdfPTable(4);
                    tbl2.addCell("   10th Marks : ");;
                    tbl2.addCell("            "+tenmarks);
                    tbl2.addCell(" Year of Passing : ");
                    tbl2.addCell("           "+tenpass);
                    doc.add(tbl2);

                    PdfPTable tbl3 = new PdfPTable(4);
                    tbl3.addCell("   12th Marks : ");;
                    tbl3.addCell("            "+twelmarks);
                    tbl3.addCell(" Year of Passing : ");
                    tbl3.addCell("           "+twelpass);
                    doc.add(tbl3);

                    PdfPTable tbl4 = new PdfPTable(2);
                    tbl4.addCell("                   University/College : ");;
                    tbl4.addCell("       "+Collegefrom+"\n                       ");
                    doc.add(tbl4);


                    PdfPTable tbl5 = new PdfPTable(4);
                    tbl5.addCell("       Course : ");;
                    tbl5.addCell("          "+course);
                    tbl5.addCell("   Current CGPA : ");
                    tbl5.addCell("              "+cgpa);
                    doc.add(tbl5);

                    Paragraph paragraph6 = new Paragraph("\nSkill Set --------------------------------------------------------------------------------------------------- "+"\n\n");
                    doc.add(paragraph6);

                    PdfPTable tbl6 = new PdfPTable(2);
//                tbl6.addCell("   Skill : ");;
                    tbl6.addCell("      "+s1);
//                tbl6.addCell("   Star Rating :");
                    tbl6.addCell("         "+st1);
                    doc.add(tbl6);

                    PdfPTable tbl7 = new PdfPTable(2);
//                tbl7.addCell("   Skill : ");;
                    tbl7.addCell("      "+s2);
//                tbl7.addCell("   Star Rating : ");
                    tbl7.addCell("         "+st2);
                    doc.add(tbl7);

                    PdfPTable tbl8 = new PdfPTable(2);
//                tbl8.addCell("   Skill : ");;
                    tbl8.addCell("      "+s3);
//                tbl8.addCell("   Star Rating : ");
                    tbl8.addCell("         "+st3);
                    doc.add(tbl8);

                    PdfPTable tbl9 = new PdfPTable(2);
//                tbl9.addCell("   Skill : ");;
                    tbl9.addCell("      "+s4);
//                tbl9.addCell("   Star Rating : ");
                    tbl9.addCell("         "+st4);
                    doc.add(tbl9);

                    PdfPTable tbl10 = new PdfPTable(2);
//                tbl10.addCell("   Skill : ");;
                    tbl10.addCell("      "+s5);
//                tbl10.addCell("   Star Rating : ");
                    tbl10.addCell("         "+st5);

                    doc.add(tbl10);

                    PdfPTable tbl11 = new PdfPTable(2);
//                tbl11.addCell("   Skill : ");;
                    tbl11.addCell("      "+s6);
//                tbl11.addCell("   Star Rating : ");
                    tbl11.addCell("         "+st6);
                    doc.add(tbl11);

                    Paragraph paragraph7 = new Paragraph("Summary --------------------------------------------------------------------------------------------------- "+"\n\n");
                    doc.add(paragraph7);

                    PdfPTable tbl12 = new PdfPTable(1);
                    tbl12.addCell("   Summay   ");
                    doc.add(tbl12);

                    PdfPTable tbl13 = new PdfPTable(1);
                    tbl13.addCell("\n"+summayh+"\n" );
                    doc.add(tbl13);
                    JOptionPane.showMessageDialog(null,"Resume Save to Drive Successfully !");
                    setVisible(false);











                }
                catch (Exception eh){
                    eh.printStackTrace();
                }
                doc.close();


            }
        });

        add(Submit);

        getContentPane().setBackground(Color.white);
        setBounds(230,10,1000,800);
        setVisible(true);




    }
}

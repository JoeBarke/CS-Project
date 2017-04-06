package final_project;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;


public class Final_Project extends Application  {
    
    // defines the scenes to be used in the program
    Scene home , howtoplay , loading , textproblem , game , resultm , resultw;
    
    // defines the buttons to be used in the program using b for button followed by the destination ( b prefix shows it is a button )
    Button bplay , bhowtoplay , bquit , bhome , bcolour , bconfirm;
    
    // defines the buttons for the game ( d for down and u for up )
    Button uangle , dangle , upower , dpower , fire;
            
    // defines the stings for storing the colours
    String cbutton , hexcolour , level ;
    
    // defines the required integers 
    int power , wind , angle , points , score , levelnumber;
    
    // defines the labels that change colour ( l shows label and p shows data label )
    Label ppower , lpower , langle , pangle , lwind , pwind , lscore , lloading;
    
    //defines the labels for the text problem and how to play screen ( the number shows the line line number it is )
    Label lline1 , htpline1 , htpline2 , htpline3 , htpline4 , htpline5 , htpline6 , htpline7 , htpline8 , htpline9 , htpline10;
    
    //defines the answer input field
    TextField tanswer;
    
     public static void main(String[] args) {
         //required statment
        launch(args);
    }
     
     @Override
    public void start(Stage thewindow) throws Exception{
        
        // sets some defaults for the 
        power = 10;
        angle = 45;
        score = 0;
        
        // loads the images
        Image backgame = new Image ("gamebackground2.jpg");
        Image cannon = new Image ("Cannon2.png");
        Image goal = new Image ("Goal.jpg");
        Image miss = new Image ("Miss.jpg");
        
        hexcolour = "838383";
        level = "meme";
        
        // set the title of the window
        thewindow.setTitle("Title of the Window");
        
        // iniitialises the layout for the home page
        GridPane ghome = new GridPane ();
        ghome.setPadding(new Insets(100 , 10 , 10 , 250));
        ghome.setVgap(10);
        ghome.setHgap(10);
        
        // initialises the how to play layout
        GridPane ghowtoplay = new GridPane ();
        ghowtoplay.setPadding(new Insets(10 , 10 , 10 , 10));
        ghowtoplay.setVgap(10);
        ghowtoplay.setHgap(10);
        
        // set the height and width for the whole program to standardise
        int height , width;
        height = 512;
        width = 778;
        
        // colour chooser choice box
        ChoiceBox<String> colourc = new ChoiceBox <>();
        colourc.getItems().addAll("Default" , "Yellow" , "Celery" , "Grass" , "Jade" , "Aqua" , "Sky" , "Purple" , "Magenta" , "Pink" , "Orange");
        colourc.setValue("Default");
        colourc.getStyleClass().add("button-colour");
        colourc.setStyle("-fx-font-size: 15px");
        colourc.getStyleClass().add("label");
        GridPane.setConstraints(colourc, 1 , 2);
        
        // updates the colour to the selected one
        bcolour = new Button();
        bcolour.setText("Update colour");
        bcolour.setOnAction(e -> getChoice(colourc));
        bcolour.getStyleClass().add("button-colour");
        bcolour.setStyle("-fx-font-size: 15px");
        GridPane.setConstraints(bcolour, 1 , 3);

        // home screen title
        Label thome = new Label (" Word Cannon ");
        thome.getStyleClass().add("label-title");
        
        // current score label
        lscore = new Label ("Score:  " + score + " ");
        lscore.getStyleClass().add("button-default");
        
        // loading label
        lloading = new Label (" Loading . . . ");
        lloading.getStyleClass().add("button-default");
        
        // text problem labels
        lline1 = new Label (" error if seen");
        lline1.getStyleClass().add("button-default");
        
        // text problem input box 
        tanswer = new TextField ();
        tanswer.setPromptText("Answer here!");
        tanswer.getStyleClass().add("button-default");
        
        // home button to launch game
        bplay = new Button();
        bplay.setText("Play");
        bplay.setOnAction(e -> {
            thewindow.setScene(loading);
            Random rand = new Random(); 
            wind = (rand.nextInt(10) + 1) - (rand.nextInt(10) + 1);
            pwind.setText(" " + wind);
            power = 10;
            ppower.setText("" + power);
            angle = 45;
            pangle.setText("" + angle); 
            tanswer.setText("");
            levelnumber = rand.nextInt(6) + 1;
            if (levelnumber == 1) {
                System.out.println("1");
                lline1.setText("The ___ [5] flew across the Atlantic Ocean carrying 150 people.");
            }
            if (levelnumber == 2) {
                System.out.println("2");
                lline1.setText("After they landed at the airport the passengers went for their ___ [7]");
            }
            if (levelnumber == 3) {
                System.out.println("3");
                lline1.setText("The car was in the garage because they ___ [4] having people round.");
            }    
            if (levelnumber == 4) {
                System.out.println("4");
                lline1.setText("The family took ___ [5] car to the car wash because it was dirty.");
            }
            if (levelnumber == 5) {
                System.out.println("5");
                lline1.setText("The cows were in the field ___ [6] the green grass.");
            }
            if (levelnumber == 6) {
                System.out.println("6");
                lline1.setText("The family and ___ [5] dog went on a long walk.");
            }
            if (levelnumber == 7) {
                System.out.println("7");
                lline1.setText("One day jack went to the toilet");
            }
            if (levelnumber == 8) {
                System.out.println("8");
                lline1.setText("One day jack went to the toilet");
            }
            if (levelnumber == 9) {
                System.out.println("9");  
                lline1.setText("One day jack went to the toilet");
            }
            try { Thread.sleep(3000); 
            } 
            catch(InterruptedException ex){
            }
            thewindow.setScene(textproblem);
        });
        bplay.getStyleClass().add("button-default");
        GridPane.setConstraints(bplay, 2 , 1);
        
        // home button to open how to play
        bhowtoplay = new Button();
        bhowtoplay.setText("How to Play");
        bhowtoplay.setOnAction(e -> thewindow.setScene(howtoplay));
        bhowtoplay.getStyleClass().add("button-default");
        GridPane.setConstraints(bhowtoplay, 2 , 2);
        
        // home button to exit the game
        bquit = new Button();
        bquit.setText("Quit");
        bquit.setOnAction( e -> thewindow.close());
        bquit.getStyleClass().add("button-default");
        GridPane.setConstraints(bquit, 2 , 3);
        
        // how to play title
        Label thowtoplay = new Label ("How To Play");
        thowtoplay.getStyleClass().add("label-title");
        GridPane.setConstraints(thowtoplay, 0 , 1);
        
        // how to play text 
        htpline1 = new Label(" - Select the best colour for you and hit change colour to alter the background ");
        htpline1.getStyleClass().add("button-default");
        htpline2 = new Label("   colour of the text.");
        htpline2.getStyleClass().add("button-default");     
        htpline3 = new Label(" - Hit the play button to get to a random level from the selection.");
        htpline3.getStyleClass().add("button-default");
        htpline4 = new Label(" - Read the text on the page and fill in the blank in the box then hit the ");
        htpline4.getStyleClass().add("button-default");
        htpline5 = new Label("   confirm button.");
        htpline5.getStyleClass().add("button-default");
        htpline6 = new Label(" - The number next to the blank is the number of characters the answer is.");
        htpline6.getStyleClass().add("button-default");
        htpline7 = new Label(" - If you get it right the game will be displayed and you have to shoot a ball into the ");
        htpline7.getStyleClass().add("button-default");
        htpline8 = new Label("   bin by changing the angle and the power using the power up and down buttons.");
        htpline8.getStyleClass().add("button-default");
        htpline9 = new Label(" - Hit fire to shoot.");
        htpline9.getStyleClass().add("button-default");
        htpline10 = new Label(" - Points are awarded for the level and hitting the bin.");
        htpline10.getStyleClass().add("button-default");
        VBox vhtptext = new VBox();
        vhtptext.setSpacing(5);
        vhtptext.getChildren().addAll(htpline1 , htpline2 , htpline3 , htpline4 , htpline5 , htpline6 , htpline7 , htpline8 , htpline9 , htpline10);
        GridPane.setConstraints(vhtptext, 0 , 2);
        
        
        
        // how to play button to home page
        bhome = new Button("Home");
        bhome.setOnAction ( e -> thewindow.setScene(home));
        bhome.getStyleClass().add("button-default");
        GridPane.setConstraints(bhome, 0 , 3);
        
        // spacer thingy label
        Label placer = new Label ("                  ");
        
        // level Title
        Label tlevel = new Label ("Fill in the blank");
        tlevel.getStyleClass().add("label-title");
        
        // button to confirm the answer
        bconfirm = new Button();
        bconfirm.setText("Confirm answer");
        bconfirm.setOnAction(e -> {
            String ans = tanswer.getText();
            System.out.println(ans);
            if ( "luggage".equals(ans) || "plane".equals(ans) || "were".equals(ans) || "their".equals(ans) || "eating".equals(ans) ){
                System.out.println("win");
                thewindow.setScene(game);
                score = score + 1;
                lscore.setText("Score:  " + score + " ");
            }
            else {
                System.out.println("lose");
                try { Thread.sleep(60); 
                } 
                catch(InterruptedException ex){
                }
                thewindow.setScene(resultm);
                try { Thread.sleep(3000); 
                } 
                catch(InterruptedException ex){
                }
                thewindow.setScene(home);
            }
        });
        bconfirm.getStyleClass().add("button-default");
        
        // adds the layering for the games labels and stuff
        Pane wgame = new Pane ();
        Pane background = new Pane ();
        Pane foreground = new Pane ();
        foreground.toFront();
        
        // goal setup
        Pane pgoal = new Pane ();
        
        // miss setup
        Pane pmiss = new Pane ();
        
        // background image for the game
        ImageView backgame2 = new ImageView();
        backgame2.setImage(backgame);
        
        // rotateable cannon
        ImageView cannon2 = new ImageView();
        cannon2.setImage(cannon);
        cannon2.setRotate(-angle);
        cannon2.setLayoutX(-10);
        cannon2.setLayoutY(390);
        
        // miss image 
        ImageView goal2 = new ImageView();
        goal2.setImage(goal);
        
        // miss image
        ImageView miss2 = new ImageView();
        miss2.setImage(miss);
        
        // labels for the game
        lpower = new Label ("  Power: ");
        lpower.getStyleClass().add("button-default");
        ppower = new Label ( " " + power );
        ppower.getStyleClass().add("button-default");
        langle = new Label ("   angle: ");
        langle.getStyleClass().add("button-default");
        pangle = new Label ( " " + angle);
        pangle.getStyleClass().add("button-default");
        lwind = new Label ("   wind: ");
        lwind.getStyleClass().add("button-default");
        pwind = new Label (" " + wind);
        pwind.getStyleClass().add("button-default");
        
        // Angle increase button 
        uangle = new Button("Increase Angle");
        uangle.setOnAction ( e -> {
            if (angle < 70){
                angle = angle + 5;
            }  
            System.out.println(angle);
            pangle.setText(" " + angle);
            cannon2.setRotate(-angle);
        });
        uangle.getStyleClass().add("button-default");
        
        // Angle decrease button
        dangle = new Button("Decrease Angle");
        dangle.setOnAction ( e -> {
            if (angle > 20){
                angle = angle - 5;
            }
            System.out.println(angle);
            pangle.setText(" " + angle);
            cannon2.setRotate(-angle);
        });
        dangle.getStyleClass().add("button-default");
        
        // Power increase button 
        upower = new Button("Increase Power");
        upower.setOnAction ( e -> {
            if (power < 20){
                power = power + 1;
            }
            ppower.setText(" " + power);
        });
        upower.getStyleClass().add("button-default");
        
        // power decrease button 
        dpower = new Button("Decrease Power");
        dpower.setOnAction ( e -> {
                if (power > 0 ){
                power = power - 1;
            }
            ppower.setText(" " + power);
        });
        dpower.getStyleClass().add("button-default");
        
        // fire button 
        fire = new Button("FIRE");
        
        // still to be finished 
        // add projectile maths here
        fire.setOnAction ( e -> {
        double rads = Math.toRadians(angle);
        System.out.println(rads);
        double t = (2 * power * Math.sin(rads)) / 9.8;
        double u = power * Math.cos(rads);
        double s = u * t + 0.5 * wind * Math.pow(t , 2) ;
        if ( s < 15 || s > 20 ) {
            System.out.println("lose");
            try { Thread.sleep(60); } 
            catch(InterruptedException ex){}
            thewindow.setScene (resultm);
        } 
        else {
            System.out.println("win");
            try { Thread.sleep(60); } 
            catch(InterruptedException ex){}
            thewindow.setScene (resultw);
            score = score + 2;
            lscore.setText("Score:  " + score + " ");
        }
        System.out.println(s);
        try { Thread.sleep(3000); } 
        catch(InterruptedException ex){}
        thewindow.setScene(home);
        });
        fire.getStyleClass().add("button-default");
        
        // creates home page layout
        VBox vcolour = new VBox();
        vcolour.setPadding(new Insets(10 , 10 , 10 , 10));
        vcolour.setSpacing(10);
        vcolour.getChildren().addAll(placer , colourc , bcolour , lscore);
        ghome.getChildren().addAll(bplay , bhowtoplay , bquit);
        BorderPane mhome = new BorderPane();
        mhome.setTop(thome);
        mhome.setCenter(ghome);
        mhome.setLeft(vcolour);
        home = new Scene(mhome, width, height);
        home.getStylesheets().add("Layouts.css");
       
        // creates how to play layout
        ghowtoplay.getChildren().addAll(thowtoplay, vhtptext , bhome);
        howtoplay = new Scene (ghowtoplay, width , height );
        howtoplay.getStylesheets().add("Layouts.css");
        
        // creates loading page layout
        StackPane loadingpane = new StackPane();
        loadingpane.getChildren().add(lloading);
        loading = new Scene (loadingpane , width + 1 , height + 1 );
        loading.getStylesheets().add("Layouts.css");
        
        // creates the text problem layout
        VBox leveltext = new VBox();
        leveltext.setPadding(new Insets(10 , 10 , 10 , 10));
        leveltext.getChildren().addAll( lline1 );
        VBox vproblem = new VBox();
        vproblem.setPadding(new Insets(10 , 10 , 10 , 10));
        vproblem.setSpacing(10);
        vproblem.getChildren().addAll( tlevel , leveltext , tanswer , bconfirm);
        textproblem = new Scene (vproblem , width , height);
        textproblem.getStylesheets().add("Layouts.css");
        
        // creates the game layout
        HBox hgame = new HBox();
        hgame.setSpacing(1);
        hgame.getChildren().addAll(lpower , ppower , langle , pangle , lwind , pwind);
        VBox vgame = new VBox();
        vgame.setSpacing(1);
        vgame.getChildren().addAll( hgame , uangle , dangle , upower , dpower , fire );
        StackPane back = new StackPane();
        back.getChildren().add(backgame2);
        background.getChildren().add(back);
        foreground.getChildren().addAll(vgame , cannon2);
        wgame.getChildren().addAll(background , foreground);
        game = new Scene ( wgame , width , height );
        game.getStylesheets().add("Layouts.css");
        
        // goal  scene
        StackPane goalpane = new StackPane();
        goalpane.getChildren().add(goal2);
        pgoal.getChildren().add(goalpane);
        resultw = new Scene (pgoal , width + 1, height + 1);
        resultw.getStylesheets().add("Layouts.css");
        
        // miss scene 
        StackPane misspane = new StackPane();
        misspane.getChildren().add(miss2);
        pmiss.getChildren().add(misspane);
        resultm = new Scene (pmiss , width + 1, height + 1);
        resultm.getStylesheets().add("Layouts.css");
        
        // set opening scene
        thewindow.setScene(home);
        
        // stops the window being resized
        thewindow.setResizable(false);
        
        // set the title of the window
        thewindow.setTitle("Dyslexia game");
        
        // makes the window visible
        thewindow.show();     
    }
    
    private void getChoice(ChoiceBox<String> colourc) {
        
        // change the background colour for the texts
        String colour = colourc.getValue();
        System.out.println(colour);
        
        if ("Default".equals(colour))   hexcolour = "838383";
        if ("Yellow".equals(colour))    hexcolour = "eeee00";
        if ("Celery".equals(colour))    hexcolour = "a8ba3c";
        if ("Grass".equals(colour))     hexcolour = "4dbd33";
        if ("Jade".equals(colour))      hexcolour = "7eb6ff";
        if ("Aqua".equals(colour))      hexcolour = "00ccff";
        if ("Sky".equals(colour))       hexcolour = "6ca6cd";
        if ("Purple".equals(colour))    hexcolour = "694489";
        if ("Magenta".equals(colour))   hexcolour = "cd00cd";
        if ("Pink".equals(colour))      hexcolour = "f7b3da";
        if ("Orange".equals(colour))    hexcolour = "ed9121";
        
        cbutton = "-fx-background-color: #" + hexcolour ;
        System.out.println(cbutton);
        bplay.setStyle(cbutton);
        bhowtoplay.setStyle(cbutton);
        bquit.setStyle(cbutton);
        bhome.setStyle(cbutton);
        bcolour.setStyle(cbutton);
        colourc.setStyle(cbutton);
        bconfirm.setStyle(cbutton);
        uangle.setStyle(cbutton);
        dangle .setStyle(cbutton);
        upower.setStyle(cbutton);
        dpower.setStyle(cbutton);
        fire.setStyle(cbutton);
        lpower.setStyle(cbutton);
        ppower.setStyle(cbutton);
        langle.setStyle(cbutton);
        pangle.setStyle(cbutton);
        lwind.setStyle(cbutton);
        pwind.setStyle(cbutton);
        lscore.setStyle(cbutton);
        lloading.setStyle(cbutton);
        lline1.setStyle(cbutton);
        tanswer.setStyle(cbutton);
        htpline1.setStyle(cbutton);
        htpline2.setStyle(cbutton);
        htpline3.setStyle(cbutton);
        htpline4.setStyle(cbutton);
        htpline5.setStyle(cbutton);
        htpline6.setStyle(cbutton);
        htpline7.setStyle(cbutton);
        htpline8.setStyle(cbutton);
        htpline9.setStyle(cbutton);
        htpline10.setStyle(cbutton);
    }   
    
}

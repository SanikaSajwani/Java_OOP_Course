public class VideoTape {
    private String title;             // Program title
    private int duration;             // Running time in minutes
    private double size;              // Video size in GB's
    private final String created;     // Created date/time (constant)
    private String resolution;        // Resolution in pixels
    private String classification;    // Program classification (Comedy, Drama, or Talk Show)
    
    public VideoTape() {
        this.title = "TITLE";
        this.duration = 0;
        this.size = 5.02;
        this.created = "2010-07-09,21:42:40";
        this.resolution = "1920 X 1080 pixels";
        this.classification = "CLASSIFICATION";
    }
    
    
    public VideoTape(String Title, int Dur, double Size, String Created, String Resolution, String Classification) {
        this.title = Title;
        this.duration = Dur;
        this.size = Size;
        this.created = Created;
        this.resolution = Resolution;
        if (Classification.equals("Comedy") || Classification.equals("Drama") || Classification.equals("Talk Show")) {
            this.classification = Classification;
        } else {
            setClassification(); 
        }
    }
    
    public void setClassification() {
        this.classification = "Comedy";
    }
    
  public VideoTape(VideoTape v) {
        this.title = v.title;
        this.duration = v.duration;
        this.size = v.size;
        this.created = v.created;
        this.resolution = v.resolution;
        this.classification = v.classification;
    }
    
    public String getTitle() { return title; }
    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration;}
    public double getSize() { return size;}
    public String getCreated() { return created;}
    public String getResolution() { return resolution;}
    public String getClassification() { return classification; }

    public void setClassification(String classification) {
        if (classification.equals("Comedy") ||
            classification.equals("Drama") ||
            classification.equals("Talk Show")) {
            this.classification = classification;
        } else {
            this.classification = "Comedy"; 
        }
    }    
    
    public void display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Duration: " + getDuration() + " minutes");
        System.out.println("Size: " + getSize() + " GB");
        System.out.println("Created: " + getCreated());
        System.out.println("Resolution: " + getResolution());
        System.out.println("Classification: " + getClassification());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        VideoTape VT1 = new VideoTape("Suits", 120, 9.5, "2005-02-03,14:30:00", "1920 X 1080 pixels", "Drama");
        VideoTape VT2 = new VideoTape("Anne with an E", 450, 5, "2021-09-15,10:00:00", "1920 X 1080 pixels", "Drama");
        
        VideoTape VT3 = new VideoTape(VT1);
        
        System.out.println("VT1:");
        VT1.display();
        System.out.println("VT2:");
        VT2.display();
        System.out.println("VT3 (copy of VT1):");
        VT3.display();
        
        VT2.setDuration(450);
        System.out.println("VT2 Edited: ");
        VT2.display();
    }
}

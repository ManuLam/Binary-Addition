int count=0;

void setup() {
  size(400,400);
  background(0);
}

void draw() {
  clear();
  fill(255);
  text("Total Clicks: "+count,50,50);
  
}

void mousePressed() {
 count++;
}
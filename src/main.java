import java.awt.Color;
class finalProject{
    public static void main(String[]args){

        Picture p=new Picture();


        //body outline
     Figure outlinebody=new Figure(307,245);
     outlinebody.drawArc(70,59, 0,170);//y-1 x-5
     outlinebody.drawArc(30,47, 170,285);//x-5
     outlinebody.drawArc(31,10, 260,280);//x-5
     outlinebody.drawArc(21,10, 220,320);//x-5
     outlinebody.drawArc(31,10, 260,280);//x-5
     outlinebody.drawArc(-35,-50, 70,185);//x-5
     outlinebody.setLineWidth(1);



        Figure body=new Figure(307,245);
        body.drawArc(70,59, 0,170);//y-1
        body.drawArc(30,47, 170,285);
        body.drawArc(31,10, 260,280);
        body.drawArc(21,10, 220,320);
        body.drawArc(31,10, 260,280);
        body.drawArc(-35,-50, 70,185);
       body.setColor(new Color(216, 209,148));
       body.setFilled(true);

     Figure ob2=new Figure(277,265);
     ob2.drawArc(40,30,0,360);
     ob2.setLineWidth(1);

     Figure b3=new Figure(276,264);
     b3.drawArc(40,30,0,360);
     b3.setColor(new Color(216, 209,148));
     b3.setFilled(true);

        Figure b2=new Figure(277,265);
        b2.drawArc(40,30,0,360);
        b2.setColor(new Color(216, 209,148));
        b2.setFilled(true);




//legs
        //leg 1
        Figure legs=new Figure(218,280);
        legs.draw(-15,-20);
        legs.drawArc(15,15, 30,210);
        legs.draw(15,20);
        legs.drawArc(15,15, 210,390);
        legs.setColor(new Color(108, 106,89));
        legs.setFilled(true);

        Figure legsoutline=new Figure(218,280);
        legsoutline.draw(-15,-20);
        legsoutline.drawArc(15,15, 30,210);
        legsoutline.draw(15,20);
        legsoutline.drawArc(15,15, 210,390);
        legsoutline.setLineWidth(1);




        Figure leg2=new Figure(282,294);
        leg2.draw(15,-20);
        leg2.drawArc(15,15, -30,150);
        leg2.draw(-15,20);
        leg2.drawArc(15,15, 150,330);
        leg2.setColor(new Color(108, 106,89));
        leg2.setFilled(true);

        Figure leg2outline=new Figure(282,294);
        leg2outline.draw(15,-20);
        leg2outline.drawArc(15,15, -30,150);
        leg2outline.draw(-15,20);
        leg2outline.drawArc(15,15, 150,330);




        //paw leg 2
        Figure iL2=new Figure(278,289);
        iL2.drawArc(10,9,0,360);
        iL2.setColor(new Color(121,119,115));
        iL2.setFilled(true);
        Figure iL2o=new Figure(278,289);
        iL2o.drawArc(10,9,0,360);
        iL2o.setLineWidth(1);


        //paws leg 1
        Figure iL=new Figure(215,290);
        iL.drawArc(10,9,0,360);
        iL.setColor(new Color(121,119,115));
        iL.setFilled(true);
        Figure iLo=new Figure(215,290);
        iLo.drawArc(10,9,0,360);
        iLo.setLineWidth(1);


        //head
     Figure heado=new Figure(255,125);
     heado.drawArc(35,20, 60,120);
     heado.drawArc(25,10, 100,170);

     heado.drawArc(25,65,95,160);
     heado.drawArc(25,97,115,170);


     Figure head=new Figure(255,125);
        head.drawArc(35,20, 60,120);
        head.drawArc(25,10, 100,170);

        head.drawArc(25,65,95,160);
        head.drawArc(25,97,115,170);

        head.setColor(new Color(108, 106,89));
        head.setFilled(true);
        heado.setLineWidth(1);




        //other side of body
        Figure side=new Figure(255,125);
        side.drawArc(-25,10, 100,170);
        side.drawArc(-25,65,95,160);
        side.drawArc(-25,97,115,170);
        side.setColor(new Color(108, 106,89));
        side.setFilled(true);

     Figure sideo=new Figure(255,125);
     sideo.drawArc(-25,10, 100,170);
     sideo.drawArc(-25,65,95,160);
     sideo.drawArc(-25,97,115,170);
     sideo.setLineWidth(1);




        //fillIn
        Figure f=new Figure(256,127);
        f.draw(40,70);
        f.draw(-98,0);
        f.close();
        f.setColor(new Color(108, 106,89));
        f.setFilled(true);

        Figure f2=new Figure(254,125);
        f2.draw(20,40);
        f2.draw(-50,0);
        f2.close();
        f2.setColor(new Color(108, 106,89));
        f2.setFilled(true);

        Figure f3=new Figure(304,240) ;
        f3.draw(-15,-52);
        f3.close();
        f3.setColor(new Color(108, 106,89));
        f3.setFilled(true);

        Figure f4=new Figure(275,190);
        f4.draw(20,0);
        f4.draw(0,20);
        f4.draw(-20,0);
        f4.draw(0,-20);
     f4.setColor(new Color(108, 106,89));
     f4.setFilled(true);

        //ear 1
        Figure eo=new Figure(276,134);
        eo.draw(6,-3);
        eo.draw(-6,-5);
        eo.drawArc(-1,1,270,490);
        eo.drawArc(5,15,270,390);
        eo.drawArc(9,25,0,140);
        eo.draw(-7,32);
        eo.drawArc(5,3,200,270);
        eo.draw(-5,2);
        eo.draw(0,3);
        eo.setLineWidth(1);

        Figure e=new Figure(276,134);
        e.draw(6,-3);
        e.draw(-6,-5);
        e.drawArc(-1,1,270,490);
        e.drawArc(5,15,270,390);
        e.drawArc(9,25,0,140);
        e.draw(-7,32);
        e.drawArc(5,3,200,270);
        e.draw(-5,2);
        e.draw(0,3);
        e.setColor(new Color(108, 106,89));
        e.setFilled(true);



        //ear 2
        Figure earoutline2=new Figure(203,132);
        earoutline2.draw(12,-4);
        earoutline2.draw(-4,-1);
        earoutline2.draw(6,-3);
        earoutline2.draw(-3,-2);
        earoutline2.drawArc(5,18,270,400);
        earoutline2.drawArc(-4,10,320,410);
        earoutline2.drawArc(12,24,60,150);
        earoutline2.draw(-4,7);
        earoutline2.draw(-2,9);
        earoutline2.draw(5,15);
        earoutline2.draw(-2,6);
        earoutline2.draw(2,3);
        earoutline2.draw(-6,3);
        earoutline2.draw(6,3);
        earoutline2.setLineWidth(1);

        Figure e2=new Figure(203,132);
        e2.draw(12,-4);
        e2.draw(-4,-1);
        e2.draw(6,-3);
        e2.draw(-3,-2);
        e2.drawArc(5,18,270,400);
        e2.drawArc(-4,10,320,410);
        e2.drawArc(12,24,60,150);
        e2.draw(-4,7);
        e2.draw(-2,9);
        e2.draw(5,15);
        e2.draw(-2,6);
        e2.draw(2,3);
        e2.draw(-6,3);
        e2.draw(6,3);
        e2.setColor(new Color(108, 106,89));
        e2.setFilled(true);



        //sky
        Figure sky=new Figure(0,0);
        sky.draw(0,2000);
        sky.draw(2000,0);
        sky.draw(0,-2000);
        sky.close();
        sky.setColor(new Color(135, 202,247));
        sky.setFilled(true);

        //eyes
     Figure eyeo=new Figure(220,150);
     eyeo.drawArc(8,9,0,360);
     eyeo.setLineWidth(1);
        Figure eye=new Figure(220,150);
        eye.drawArc(8,9,0,360);
        eye.setColor(new Color(245,245,245));
        eye.setFilled(true);
        Figure eB=new Figure(220,153);
        eB.drawArc(4,4,0,360);
        eB.setColor(new Color(5,5,5));
        eB.setFilled(true);

     Figure eye20=new Figure(270,150);
     eye20.drawArc(8,9,0,360);
     eye20.setLineWidth(1);
        Figure eye2=new Figure(270,150);
        eye2.drawArc(8,9,0,360);
        eye2.setColor(new Color(245,245,245));
        eye2.setFilled(true);
        Figure eB2=new Figure(270,153);
        eB2.drawArc(4,4,0,360);
        eB2.setColor(new Color(5,5,5));
        eB2.setFilled(true);

        //nose
        Figure n=new Figure(229, 156);//x-2
        n.drawArc(-7,3,0,90);
        Figure n2=new Figure(246, 155);//x-1
        n2.drawArc(4,3,0,140);
        Figure nose=new Figure(231,158); //x-2
        nose.drawArc(-1,2,0,90);
        nose.draw(12,0);
        nose.drawArc(1,-1,270,480);
        nose.draw(-3,2);
        nose.drawArc(-3,2, 190,360);
        nose.draw(-3,-1);
        nose.draw(-2,-1);
        nose.setFilled(true);
       nose.setColor(new Color(5,5,5));

       //lips
        Figure lo=new Figure(200,172);
        lo.draw(2,-2);
        lo.draw(30,-3);
        lo.draw(4,-2);
        lo.draw(5,0);
        lo.draw(8,2);
        lo.draw(20,2);
        lo.draw(5,0);
        lo.drawArc(2,-1,270,480);
        lo.draw(-18,8);
        lo.draw(-5,1);
        lo.draw(-23,-0);
        lo.draw(-25,-7);
        lo.close();
        lo.setLineWidth(1);

        Figure l=new Figure(200,172);
        l.draw(2,-2);
        l.draw(30,-3);
        l.draw(4,-2);
       l.draw(5,0);
        l.draw(8,2);
        l.draw(20,2);
        l.draw(5,0);
        l.drawArc(2,-1,270,480);
        l.draw(-18,8);
        l.draw(-5,1);
        l.draw(-23,-0);
        l.draw(-25,-7);
        l.close();
        l.setColor(new Color(230,230,230));
        l.setFilled(true);

        //teeth-6
        Figure t1=new Figure(213,170);
        t1.draw(-1,5);
     Figure t2=new Figure(225,168);
     t2.draw(-1,5);
t2.draw(0,5);
     Figure t3=new Figure(237,165);
     t3.draw(1,7);
     t3.draw(-1,7);
     Figure t4=new Figure(250,167);
     t4.draw(1,7);
     t4.draw(0,6);
     Figure t5=new Figure(262,168);
     t5.draw(1,7);

     //arms
     Figure oarm=new Figure(178,177);
     oarm.drawArc(43,58,110,180);
     oarm.draw(2,10);
     oarm.draw(6,11);
     oarm.draw(10,6);
     oarm.close();
     oarm.setLineWidth(1);


     Figure arm=new Figure(178,177);
     arm.drawArc(43,58,110,180);
     arm.draw(2,10);
     arm.draw(6,11);
     arm.draw(15,11);
     arm.setColor(new Color(108, 106,89));
     arm.setFilled(true);

     Figure arm1o=new Figure(298,177);
     arm1o.drawArc(-43,58,110,180);
     arm1o.draw(-2,10);
     arm1o.draw(-6,11);
     arm1o.draw(-13,9);
     arm1o.close();

     Figure arm1=new Figure(298,177);
     arm1.drawArc(-43,58,110,180);
     arm1.draw(-2,10);
     arm1.draw(-6,11);
     arm1.draw(-15,11);
    // arm1.close();
     arm1.setColor(new Color(108, 106,89));
     arm1.setFilled(true);

     //chest
        Figure des1o=new Figure(195,209);
        des1o.draw(15,-9);
        des1o.draw(4,0);
        des1o.draw(7,6);
        des1o.drawArc(2,-1,300,500);
        des1o.draw(-10,-2);
        des1o.draw(3,0);
        des1o.draw(-15,5);
        des1o.drawArc(2,-1,90,270);
        Figure des1=new Figure(195,209);
        des1.draw(15,-9);
        des1.draw(4,0);
        des1.draw(7,6);
        des1.drawArc(2,-1,300,500);
        des1.draw(-10,-2);
        des1.draw(3,0);
        des1.draw(-15,5);
        des1.drawArc(2,-1,90,270);
        des1.setColor(new Color(108, 106,89));
        des1.setFilled(true);

        Figure des2o=new Figure(247,206);
        des2o.draw(8,-8);
        des2o.draw(4,0);
        des2o.draw(11,8);
        des2o.draw(1,3);
        des2o.drawArc(2,-1,300,540);
        des2o.draw(-8,-4);
        des2o.draw(-4,0);
        des2o.draw(-8,2);
        des2o.close();
        Figure des2=new Figure(247,206);
        des2.draw(8,-8);
        des2.draw(4,0);
        des2.draw(11,8);
        des2.draw(1,3);
        des2.drawArc(2,-1,300,540);
        des2.draw(-8,-4);
        des2.draw(-4,0);
        des2.draw(-8,2);
        des2.close();
        des2.setColor(new Color(108, 106,89));
        des2.setFilled(true);

        Figure des3=new Figure(182,230);
        des3.draw(9,-10);
        des3.draw(4,0);
        des3.draw(7,3);
        des3.drawArc(3,-2,300,460);
        des3.draw(-4,-1);
        des3.draw(-4,0);
        des3.draw(-6,4);
        des3.draw(-2,1);
        des3.close();
        des3.setColor(new Color(108, 106,89));
        des3.setFilled(true);

        Figure des3o=new Figure(182,230);
        des3o.draw(9,-10);
        des3o.draw(4,0);
        des3o.draw(7,3);
        des3o.drawArc(3,-2,300,460);
        des3o.draw(-4,-1);
        des3o.draw(-4,0);
        des3o.draw(-6,4);
        des3o.draw(-2,1);
        des3o.close();

        Figure des4=new Figure(224,224);
        des4.draw(9,-7);
        des4.draw(4,0);
        des4.draw(7,3);
        des4.drawArc(3,-2,300,475);
        des4.draw(-4,0);
        des4.draw(-2,0);
        des4.draw(-6,2);
        des4.draw(-4,0);
        des4.draw(-2,-2);
        des4.setColor(new Color(108, 106,89));
        des4.setFilled(true);

        Figure des4o=new Figure(224,224);
        des4o.draw(9,-7);
        des4o.draw(4,0);
        des4o.draw(7,3);
        des4o.drawArc(3,-2,300,475);
        des4o.draw(-4,0);
        des4o.draw(-2,0);
        des4o.draw(-6,2);
        des4o.draw(-4,0);
        des4o.draw(-2,-2);

        Figure des5=new Figure(260,228);
        des5.draw(12,-9);
        des5.draw(4,0);
        des5.draw(7,6);
        des5.drawArc(2,-1,300,500);
        des5.draw(-10,-2);
        des5.draw(3,0);
        des5.draw(-15,5);

        des5.setColor(new Color(108, 106,89));
        des5.setFilled(true);
        Figure des5o=new Figure(260,228);
        des5o.draw(12,-9);
        des5o.draw(4,0);
        des5o.draw(7,6);
        des5o.drawArc(2,-1,300,500);
        des5o.draw(-10,-2);
        des5o.draw(3,0);
        des5o.draw(-15,5);

        Figure w1=new Figure(195,157);
        w1.drawArc(2,-1,300,510);
        w1.drawArc(-40,-15,215,267);
        w1.draw(2,-1);
        w1.close();
        w1.setLineWidth(2);
        w1.setColor(new Color(55,59,56));



        Figure w2=new Figure(190,161);
        w2.drawArc(2,-1,300,510);
        w2.drawArc(-50,-10,215,267);
        w2.draw(2,-1);
        w2.close();
        w2.setLineWidth(2);
        w2.setColor(new Color(55,59,56));

        Figure w3=new Figure(184,165);
        w3.drawArc(2,-1,300,510);
        w3.drawArc(-35,-5,215,267);
        w3.draw(2,-1);
        w3.close();
        w3.setLineWidth(2);
        w3.setColor(new Color(55,59,56));

        Figure w4=new Figure(285,157);
        w4.drawArc(2,-1,300,510);
        w4.drawArc(40,-15,215,267);
        w4.draw(-2,-1);
        w4.close();
        w4.setLineWidth(2);
        w4.setColor(new Color(55,59,56));

        Figure w5=new Figure(290,161);
        w5.drawArc(2,-1,300,510);
        w5.drawArc(50,-10,215,267);
        w5.draw(-2,-1);
        w5.close();
        w5.setLineWidth(2);
        w5.setColor(new Color(55,59,56));

        Figure w6=new Figure(294,165);
        w6.drawArc(2,-1,300,510);
        w6.drawArc(35,-5,215,267);
        w6.draw(-2,-1);
        w6.close();
        w6.setLineWidth(2);
        w6.setColor(new Color(55,59,56));







     p.add(sky);
     p.add(e);
     p.add(e2);
     p.add(eo);
     p.add(earoutline2);
        p.add(head);
       p.add(heado);
        p.add(side);
        p.add(f);
        p.add(f2);
        p.add(f3);
        p.add(f4);
        p.add(b2);
     p.add(ob2);
     p.add(sideo);
     p.add(arm);
     p.add(arm1);
     p.add(oarm);
     p.add(arm1o);
        p.add(body);
        p.add(outlinebody);
          p.add(b3);
        p.add(legs);
        p.add(leg2);
        p.add(iL);
        p.add(iL2);
        p.add(eye);
        p.add(eye2);
        p.add(eB);
        p.add(eB2);
        p.add(n);
        p.add(n2);
        p.add(nose);
        p.add(l);
        p.add(lo);
        p.add(t1);
        p.add(t2);
     p.add(t3);
     p.add(t4);
     p.add(t5);
     p.add(eyeo);
     p.add(eye20);
     p.add(legsoutline);
p.add(leg2outline);
p.add(iL2o);
p.add(iLo);
p.add(des1);
p.add(des1o);
p.add(des2);
p.add(des2o);
p.add(des3);
p.add(des3o);
p.add(des4);
p.add(des4o);
p.add(des5);
p.add(des5o);
p.add(w1);
p.add(w2);
p.add(w3);
p.add(w4);
p.add(w5);
p.add(w6);
    }

}




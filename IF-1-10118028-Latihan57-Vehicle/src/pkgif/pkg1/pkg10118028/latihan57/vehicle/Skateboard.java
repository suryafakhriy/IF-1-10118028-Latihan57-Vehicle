/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118028.latihan57.vehicle;

/**
 *
 * @author User
 */
public class Skateboard extends Vehicle{
    private double myBoardLength;

    public Skateboard() {
        setMyBrand("Ally Skate");
        setMyModel("Rocket");
        setBoardLength(54.5);
        System.out.println("SkateBoard");
        System.out.println("Brand : " + getMyBrand());
        System.out.println("Model : " + getMyModel());
        System.out.println("Panjangnya Board : " + getBoardLength());
    }

    public double getBoardLength() {
        return myBoardLength;
    }

    public void setBoardLength(double BoardLength) {
        this.myBoardLength = BoardLength;
    }

    
}

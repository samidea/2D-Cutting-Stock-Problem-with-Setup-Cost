/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.solver;

/**
 *
 * @author Adrien
 */
public class ImageKind extends Sizable
{
    public ImageKind(int sizeW, int sizeH, int demand, PatternKind patternKind)
    {
        super(sizeW, sizeH);
        
        this.maxNumber = (patternKind.getHeight() * patternKind.getWidth()) / (sizeW * sizeH);
        this.patternIndex = patternKind.getNumberOfImages();
        this.demand = demand;
        
        patternKind.addImageKind(this);
    }
    
    private final int maxNumber;
    private final int patternIndex;
    private final int demand;
    
    public int getDemand()
    {
        return demand;
    }
    
    public int getPatternIndex()
    {
        return patternIndex;
    }
    
    public int getMaximumNumber()
    {
        return maxNumber;
    }
}

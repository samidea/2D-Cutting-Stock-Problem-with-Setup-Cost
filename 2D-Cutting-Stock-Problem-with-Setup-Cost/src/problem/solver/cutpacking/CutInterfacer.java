package problem.solver.cutpacking;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import problem.solver.Pattern;
import problem.solver.parameters.PatternKind;
import problem.solver.patternplacement.ImageLocation;
import problem.solver.patternplacement.PatternPlacement;

public class CutInterfacer extends PatternPlacement
{
    public CutInterfacer(PatternKind patternKind)
    {
        super(patternKind);
    }
    
    @Override
    public ImageLocation[] getLocations(Pattern pattern)
    {
        int[] e = new int[pattern.getImageNumber().length];
        for(int i = 0; i < e.length; i++)
            e[i] = (int)pattern.getImageNumber()[i];
        
        Ptrn ptrn = new Ptrn(e, super.patternKind);
        
        if(ptrn.fit())
            return ptrn.getPositions().stream().toArray(ImageLocation[]::new);
        else
            return null;
    }
}

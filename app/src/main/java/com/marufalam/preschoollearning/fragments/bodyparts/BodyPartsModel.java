package com.marufalam.preschoollearning.fragments.bodyparts;

import com.marufalam.preschoollearning.R;
import java.util.ArrayList;
import java.util.List;

public class BodyPartsModel {
    int bodyImg,bodyName,bodySound;

    public BodyPartsModel() {
    }

    public BodyPartsModel(int bodyImg, int bodyName, int bodySound) {
        this.bodyImg = bodyImg;
        this.bodyName = bodyName;
        this.bodySound = bodySound;
    }

    public int getBodyImg() {
        return bodyImg;
    }

    public void setBodyImg(int bodyImg) {
        this.bodyImg = bodyImg;
    }

    public int getBodyName() {
        return bodyName;
    }

    public void setBodyName(int bodyName) {
        this.bodyName = bodyName;
    }

    public int getBodySound() {
        return bodySound;
    }

    public void setBodySound(int bodySound) {
        this.bodySound = bodySound;
    }
    
    public static List<BodyPartsModel> getBodyParts(){
        final ArrayList<BodyPartsModel>item = new ArrayList<>();

        item.add(new BodyPartsModel(R.drawable.arm_t,  R.drawable.arm,R.raw.arm));
        item.add(new BodyPartsModel(R.drawable.ears_t,  R.drawable.ears,R.raw.ears));
        item.add(new BodyPartsModel(R.drawable.eyes_t,  R.drawable.eyes,R.raw.eyes));
        item.add(new BodyPartsModel(R.drawable.forehead_t,  R.drawable.forehead,R.raw.forehad));
        item.add(new BodyPartsModel(R.drawable.hand_t,  R.drawable.hand,R.raw.hand));
        item.add(new BodyPartsModel(R.drawable.head_t,  R.drawable.head,R.raw.head));
        item.add(new BodyPartsModel(R.drawable.leg_t,  R.drawable.leg,R.raw.leg));
        item.add(new BodyPartsModel(R.drawable.mouth_t,  R.drawable.mouth,R.raw.mouth));
        item.add(new BodyPartsModel(R.drawable.neck_t,  R.drawable.neck,R.raw.neck));
        item.add(new BodyPartsModel(R.drawable.nose_t,  R.drawable.nose,R.raw.nose));
        item.add(new BodyPartsModel(R.drawable.shoulder_t,  R.drawable.shoulder,R.raw.shoulder));
        item.add(new BodyPartsModel(R.drawable.teeth_t,  R.drawable.teeth,R.raw.teeth));
            
        
        return item;
    }
    
}

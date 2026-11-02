package gg.corz;

import java.awt.Color;

public enum iIIlIillIlIlIill {
   iliiillill,
   iiiiillill,
   Iiiiillill,
   liiiillill;
   // $VF: synthetic field
   private static final iIIlIillIlIlIill[] IIIIIilill = liiiIIllIl();

   public Color IliIlllilIi() {
      return switch (this) {
         case iiiiillill -> new Color(255, 255, 0);
         case Iiiiillill -> new Color(255, 165, 0);
         case liiiillill -> new Color(255, 50, 50);
         default -> new Color(200, 200, 200);
      };
   }
}

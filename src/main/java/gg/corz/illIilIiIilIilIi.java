package gg.corz;

import net.minecraft.class_2960;

final class illIilIiIilIilIi {
   int IllIIllIIi;
   long iIlIIllIIi;
   float IIiIIllIIi;
   long lIlIIllIIi;
   long liIIIllIIi;
   class_2960 lilIIllIIi;
   class_2960 IilIIllIIi;
   float lIiIIllIIi;
   String lllIIllIIi;
   boolean IliIIllIIi;
   float iIiIIllIIi;
   long IiIIIllIIi;
   float iilIIllIIi;
   String illIIllIIi;
   long iiIIIllIIi;
   long IIlIIllIIi;

   private illIilIiIilIilIi() {
   }

   float IliIlllilIi(float target, float rate) {
      if (!this.IliIIllIIi) {
         this.IliIIllIIi = true;
         this.iIiIIllIIi = target;
         return this.iIiIIllIIi;
      } else {
         this.iIiIIllIIi = (float)IiiIIIIlliiIIIIl.iIlIlllllill((double)this.iIiIIllIIi, (double)target, (double)rate, llIilillilIilill.liiiIIllIl());
         if (Math.abs(this.iIiIIllIIi - target) < 0.002F) {
            this.iIiIIllIIi = target;
         }

         return this.iIiIIllIIi;
      }
   }
}

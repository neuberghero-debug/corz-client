package gg.corz;

import net.minecraft.class_2338;

public final class iiIlIiIiIIllIiIi {
   private int iiiIIIiIIi;
   private boolean IIIlIIiIIi;
   private class_2338 liiIIIiIIi;

   public void lIiiIiIlilli() {
      this.liiIIIiIIi = null;
      this.iiiIIIiIIi = 0;
      this.IIIlIIiIIi = false;
   }

   public void liiiIIllIl(class_2338 anchor) {
      if (anchor != null && anchor.equals(this.liiIIIiIIi)) {
         this.lIiiIiIlilli();
      }
   }

   public boolean iIlIlllllill(class_2338 anchor) {
      return anchor != null && anchor.equals(this.liiIIIiIIi) && this.iiiIIIiIIi >= 2;
   }

   public boolean IliIlllilIi(class_2338 anchor) {
      if (anchor == null) {
         return false;
      } else {
         if (!anchor.equals(this.liiIIIiIIi)) {
            this.liiIIIiIIi = anchor.method_10062();
            this.iiiIIIiIIi = 0;
            this.IIIlIIiIIi = false;
         }

         this.iiiIIIiIIi++;
         if (this.iiiIIIiIIi >= 2 && !this.IIIlIIiIIi) {
            this.IIIlIIiIIi = true;
            return true;
         } else {
            return false;
         }
      }
   }

   public int IilliliilIIi(class_2338 anchor) {
      return anchor != null && anchor.equals(this.liiIIIiIIi) ? this.iiiIIIiIIi : 0;
   }
}

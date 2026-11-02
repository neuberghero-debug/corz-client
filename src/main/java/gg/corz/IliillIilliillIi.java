package gg.corz;

import java.util.Arrays;

final class IliillIilliillIi {
   private final float IilllIlIIi;
   private int[] lilllIlIIi = new int[4];
   private final IllIIiillllIIiil illllIlIIi;
   private IllllIlilllllIli[] iilllIlIIi = new IllllIlilllllIli[4];
   private int IIillIlIIi;

   IliillIilliillIi(IllIIiillllIIiil P, float g) {
      this.illllIlIIi = P;
      this.IilllIlIIi = g;
   }

   IllllIlilllllIli IliIlllilIi(int ge, float[] groupMask) {
      for (int var3 = 0; var3 < this.IIillIlIIi; var3++) {
         if (this.lilllIlIIi[var3] == ge) {
            return this.iilllIlIIi[var3];
         }
      }

      IllllIlilllllIli var4 = iiiilIiIIIIiIi.Iiilliiliiil(
         this.illllIlIIi,
         ge,
         groupMask,
         iiiilIiIIIIiIi.iIlIlllllill(groupMask[2] - groupMask[0], this.IilllIlIIi),
         iiiilIiIIIIiIi.iIlIlllllill(groupMask[3] - groupMask[1], this.IilllIlIIi),
         this.IilllIlIIi
      );
      if (this.IIillIlIIi == this.lilllIlIIi.length) {
         this.lilllIlIIi = Arrays.copyOf(this.lilllIlIIi, this.IIillIlIIi * 2);
         this.iilllIlIIi = Arrays.copyOf(this.iilllIlIIi, this.IIillIlIIi * 2);
      }

      this.lilllIlIIi[this.IIillIlIIi] = ge;
      this.iilllIlIIi[this.IIillIlIIi++] = var4;
      return var4;
   }
}

package gg.corz;

import net.minecraft.class_8685;

final class iIlilliIllilli extends iIiliiIlilii {
   float IiilliIIIl;
   static final long llilliIIIl = 220000000L;
   int iiilliIIIl = -1;
   static final float IlilliIIIl = 0.22F;
   static final float IIilliIIIl = 4.0F;
   static final float lIilliIIIl = 8.0F;
   class_8685 liilliIIIl;
   long lIIiliIIIl;
   final String ililliIIIl;
   static final float iIilliIIIl = 2.5F;
   int IIIiliIIIl;

   iIlilliIllilli(String name) {
      this.ililliIIIl = name;
   }

   int iliIiiliiiii(long now) {
      if (this.iiilliIIIl < 0) {
         return (-800214316 - 117 >>> 9 | -800214316 - 117 << 23) - 37 ^ 790092107;
      } else {
         float var3 = (float)(now - this.lIIiliIIIl) / 2.2E8F;
         return IiIIIIIlliIIIIIl.IiIIlliIIl(this.IIIiliIIIl, this.iiilliIIIl, llliIlIlilliIlIl.iIlIlllllill(var3));
      }
   }

   void lIiiIiIlilli(int now, long want) {
      if (this.iiilliIIIl != now) {
         this.IIIiliIIIl = this.iiilliIIIl < 0 ? now : this.iliIiiliiiii(want);
         this.iiilliIIIl = now;
         this.lIIiliIIIl = want;
      }
   }
}

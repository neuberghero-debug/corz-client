package gg.corz;

import java.util.function.IntConsumer;

public final class iIIiliiIlIilii {
   public float iIIIlliIIl;
   public float IlIIlliIIl;
   llillIlilillIl lIiIlliIIl;
   public float illIlliIIl;
   public float lIIIlliIIl;
   public boolean iilIlliIIl;
   public boolean iiIIlliIIl;
   public boolean IIlIlliIIl;
   public float ilIIlliIIl;
   public float liIIlliIIl;
   iIllIilIlllIil IIiIlliIIl;
   public float lllIlliIIl;
   public boolean lilIlliIIl;
   public float IllIlliIIl;
   public int iIlIlliIIl;
   public int lIlIlliIIl = -1;
   public float llIIlliIIl;
   public float IilIlliIIl;

   public void IIIllIIliIIl(String bx, float id, float by, float bw, float act, Runnable bh) {
      this.IiIlliIliiIl(id, by, bw, act, 0, bx, bh, null);
   }

   public boolean IilliliilIIi(float bh, float bx, float bw, float by) {
      return this.iilIlliIIl
         && !this.IIlIlliIIl
         && this.iIlIlllllill((double)this.ilIIlliIIl, (double)this.liIIlliIIl)
         && this.ilIIlliIIl >= bh
         && this.ilIIlliIIl <= bh + bw
         && this.liIIlliIIl >= bx
         && this.liIIlliIIl <= bx + by;
   }

   public iIIiliiIlIilii() {
      this.iIlIlliIIl = -1;
      this.IllIlliIIl = 1.0F;
      this.lllIlliIIl = 1.0F;
      this.lilIlliIIl = true;
   }

   public boolean iIlIlllllill(double px, double py) {
      return px >= (double)this.lIIIlliIIl
         && px <= (double)(this.lIIIlliIIl + this.IlIIlliIIl)
         && py >= (double)this.iIIIlliIIl
         && py <= (double)(this.iIIIlliIIl + this.llIIlliIIl);
   }

   public float IliIlllilIi() {
      return this.lIIIlliIIl + this.IlIIlliIIl / 2.0F;
   }

   public float iliIiiliiiii(String id, float depth) {
      return this.IIiIlliIIl == null ? 1.0F : this.IIiIlliIIl.IiIlliIliiIl(id, depth);
   }

   public void IlIlllIlilIl(String bh, float bx, float fn, float bw, float id, IntConsumer by) {
      this.IiIlliIliiIl(bx, fn, bw, id, 1, bh, null, by);
   }

   private void IiIlliIliiIl(float bh, float fn, float act, float kind, int by, String id, Runnable bw, IntConsumer bx) {
      if (this.iilIlliIIl && this.lIiIlliIIl != null) {
         float var9 = Math.max(bh, this.lIIIlliIIl);
         float var10 = Math.max(fn, this.iIIIlliIIl);
         float var11 = Math.min(bh + act, this.lIIIlliIIl + this.IlIIlliIIl);
         float var12 = Math.min(fn + kind, this.iIIIlliIIl + this.llIIlliIIl);
         if (var11 - var9 > 0.5F && var12 - var10 > 0.5F) {
            this.lIiIlliIIl.liiiIIllIl(var9, var10, var11 - var9, var12 - var10, by, id, bw, bx, 0);
         }
      }
   }

   public float liiiIIllIl() {
      return this.iIIIlliIIl + this.llIIlliIIl / 2.0F;
   }

   public float lIiiIiIlilli(String bh, float bw, float id, float bx, float by) {
      return this.IIiIlliIIl == null ? 0.0F : this.IIiIlliIIl.lIiiIiIlilli(bh, this.IilliliilIIi(bw, id, bx, by));
   }
}

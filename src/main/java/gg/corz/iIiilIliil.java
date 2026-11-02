package gg.corz;

import java.util.function.IntConsumer;

public final class iIiilIliil {
   public float lIlIiliiIlIili;
   public float lilIiliiilIili;
   public boolean lliIiliiliIili;
   public float illIiliIilIili;
   public float IllIililllIili;
   iIllIilIlllIil IiiIililiiIili;
   public float iiIIiliIIlIili;
   public float IIiIililIiIili;
   public float iIiIiliIliIili;
   llillIlilillIl iiiIiliIIIlili;

   public float iIlIlllllill(String id, float rate, float target) {
      return this.IiiIililiiIili.IilliliilIIi(id, rate, target);
   }

   private void IlIlllIlilIl(float bh, float id, float bw, float act, int bx, String kind, Runnable by, IntConsumer fn) {
      if (this.lliIiliiliIili && this.iiiIiliIIIlili != null) {
         float var9 = Math.max(bh, this.iiIIiliIIlIili);
         float var10 = Math.max(id, this.lIlIiliiIlIili);
         float var11 = Math.min(bh + bw, this.iiIIiliIIlIili + this.IllIililllIili);
         float var12 = Math.min(id + act, this.lIlIiliiIlIili + this.illIiliIilIili);
         if (var11 - var9 > 0.5F && var12 - var10 > 0.5F) {
            this.iiiIiliIIIlili.liiiIIllIl(var9, var10, var11 - var9, var12 - var10, bx, kind, by, fn, 0);
         }
      }
   }

   public boolean IIIllIIliIIl(double py, double px) {
      return py >= (double)this.iiIIiliIIlIili
         && py <= (double)(this.iiIIiliIIlIili + this.IllIililllIili)
         && px >= (double)this.lIlIiliiIlIili
         && px <= (double)(this.lIlIiliiIlIili + this.illIiliIilIili);
   }

   public void iliIiiliiiii(String bw, float fn, float bh, float bx, float id, IntConsumer by) {
      this.IlIlllIlilIl(fn, bh, bx, id, 1, bw, null, by);
   }

   public void lIiiIiIlilli(String bw, float bh, float by, float act, float bx, Runnable id) {
      this.IlIlllIlilIl(bh, by, act, bx, 0, bw, id, null);
   }

   public float IilliliilIIi(String depth, float id) {
      return this.IiiIililiiIili.IiIlliIliiIl(depth, id);
   }

   public float liiiIIllIl(String bh, float id, float bx, float bw, float by) {
      return this.IiiIililiiIili.lIiiIiIlilli(bh, this.IliIlllilIi(id, bx, bw, by));
   }

   public boolean IliIlllilIi(float bh, float bw, float bx, float by) {
      return this.lliIiliiliIili
         && this.IIIllIIliIIl((double)this.lilIiliiilIili, (double)this.IIiIililIiIili)
         && this.lilIiliiilIili >= bh
         && this.lilIiliiilIili <= bh + bx
         && this.IIiIililIiIili >= bw
         && this.IIiIililIiIili <= bw + by;
   }
}

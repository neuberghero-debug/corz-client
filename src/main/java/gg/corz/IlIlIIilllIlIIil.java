package gg.corz;

public final class IlIlIIilllIlIIil {
   private int iIiIIlIIil;
   private float IIiIIlIIil;
   private float lIiIIlIIil;
   private static final float[] IilIIlIIil = new float[0];
   private float[] iilIIlIIil = IilIIlIIil;
   private long lilIIlIIil;
   public static final float lllIIlIIil = 0.1F;
   public static final float illIIlIIil = 0.02F;
   private boolean IliIIlIIil;

   public boolean IilliliilIIi() {
      return this.IliIIlIIil;
   }

   public float iIlIlllllill() {
      return this.lIiIIlIIil;
   }

   public void iliIiiliiiii(lililiiiililii sink) {
      this.lIiiIiIlilli(0L, null, 0.0F, 0.0F, true, sink);
   }

   public int liiiIIllIl() {
      return this.iIiIIlIIil;
   }

   public long IliIlllilIi() {
      return this.lilIIlIIil;
   }

   public IlIlIIilllIlIIil() {
      this.lIiIIlIIil = Float.NEGATIVE_INFINITY;
   }

   public void lIiiIiIlilli(long run, float[] times, float muted, float sink, boolean length, lililiiiililii time) {
      if (run != this.lilIIlIIil) {
         long var8 = this.lilIIlIIil;
         boolean var10 = var8 != 0L && this.IliIIlIIil && this.lIiIIlIIil < this.IIiIIlIIil - 0.02F;
         this.lilIIlIIil = run;
         this.iilIIlIIil = run != 0L && times != null ? times : IilIIlIIil;
         this.IIiIIlIIil = muted;
         this.iIiIIlIIil = 0;
         this.lIiIIlIIil = Float.NEGATIVE_INFINITY;
         this.IliIIlIIil = false;
         if (var10 && time != null) {
            time.liiiIIllIl(var8);
         }
      }

      if (run != 0L) {
         if (!(sink >= this.lIiIIlIIil)) {
            sink = this.lIiIIlIIil;
         }

         this.lIiIIlIIil = sink;

         while (this.iIiIIlIIil < this.iilIIlIIil.length && this.iilIIlIIil[this.iIiIIlIIil] <= sink) {
            int var11 = this.iIiIIlIIil++;
            if (!length && !(sink - this.iilIIlIIil[var11] > 0.1F) && time != null) {
               this.IliIIlIIil = true;
               time.IliIlllilIi(var11);
            }
         }
      }
   }
}

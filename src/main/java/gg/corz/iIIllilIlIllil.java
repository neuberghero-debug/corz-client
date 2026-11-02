package gg.corz;

public final class iIIllilIlIllil {
   public static final float iiiliiiIiIIIiiiiIi = 22.0F;
   private final float lIiiiiiIiiIiiiiiIi;
   public static final float IIliiiiIilIliiiiIi = 720.0F;
   private float lIlIIIIliiIlIIIIli;
   public static final float liIiiiiIiiiIiiiiIi = 12.0F;
   public static final float iIliiiiIiIlliiiiIi = 0.5F;
   public static final float IlIiiiiIillIiiiiIi = 1.15F;
   private float iiIIIIIliIIlIIIIli;
   private float illIIIIliIilIIIIli;
   private final float iiliiiiIiIIiiiiiIi;
   private final float IliiiiiIilliiiiiIi;
   private float IllIIIIlilllIIIIli;
   private float iIIIIIIliIlIIIIIli;
   private final float IiliiiiIililiiiiIi;
   private final float llliiiiIiilliiiiIi;
   public static final float ilIiiiiIiIiIiiiiIi = 4.5F;
   private float IIIIIIIlilIIIIIIli;
   private float liiiiiiIiiiiiiiiIi;
   private final float iliiiiiIiIiiiiiiIi;
   private boolean lilIIIIliiilIIIIli;
   private float llIIIIIliilIIIIIli;
   public static final float lIIiiiiIiiIIiiiiIi = 14.0F;
   private float IiIIIIIliliIIIIIli;

   public iIIllilIlIllil(float zoom, float maxZoom, float minZoom, float pitch, float yaw, float pitchLimit) {
      this.lIiiiiiIiiIiiiiiIi = Math.min(pitch, yaw);
      this.IliiiiiIilliiiiiIi = Math.max(pitch, yaw);
      this.iliiiiiIiIiiiiiiIi = Math.abs(pitchLimit);
      this.llliiiiIiilliiiiIi = zoom;
      this.IiliiiiIililiiiiIi = this.IIIilIIiiIIi(maxZoom);
      this.iiliiiiIiIIiiiiiIi = this.IlIillIiilIi(minZoom);
      this.IiIlliIliiIl();
   }

   public void IIlllIlliIll(float dt) {
      if (!(dt <= 0.0F)) {
         if (this.lilIIIIliiilIIIIli) {
            this.lIlIIIIliiIlIIIIli = this.lIlIIIIliiIlIIIIli + (this.IllIIIIlilllIIIIli / dt - this.lIlIIIIliiIlIIIIli) * 0.5F;
            this.IllIIIIlilllIIIIli = 0.0F;
         } else if (this.lIlIIIIliiIlIIIIli != 0.0F) {
            this.llIIIIIliilIIIIIli = this.llIIIIIliilIIIIIli + this.lIlIIIIliiIlIIIIli * dt;
            this.lIlIIIIliiIlIIIIli = this.lIlIIIIliiIlIIIIli * (float)Math.exp((double)(-4.5F * dt));
            if (Math.abs(this.lIlIIIIliiIlIIIIli) < 1.0F) {
               this.lIlIIIIliiIlIIIIli = 0.0F;
            }
         } else if (this.illIIIIliIilIIIIli != 0.0F) {
            this.llIIIIIliilIIIIIli = this.llIIIIIliilIIIIIli + this.illIIIIliIilIIIIli * dt;
         }

         this.liiiiiiIiiiiiiiiIi = IiIiliIiiiIi(this.liiiiiiIiiiiiiiiIi, this.llIIIIIliilIIIIIli, 22.0F, dt);
         this.IIIIIIIlilIIIIIIli = IiIiliIiiiIi(this.IIIIIIIlilIIIIIIli, this.IiIIIIIliliIIIIIli, 22.0F, dt);
         this.iIIIIIIliIlIIIIIli = IiIiliIiiiIi(this.iIIIIIIliIlIIIIIli, this.iiIIIIIliIIlIIIIli, 14.0F, dt);
         if (Math.abs(this.llIIIIIliilIIIIIli) > 720.0F) {
            float var2 = (float)Math.round(this.llIIIIIliilIIIIIli / 360.0F) * 360.0F;
            this.llIIIIIliilIIIIIli -= var2;
            this.liiiiiiIiiiiiiiiIi -= var2;
         }
      }
   }

   public void iliIiiliiiii(double amount) {
      this.iiIIIIIliIIlIIIIli = this.IlIillIiilIi(this.iiIIIIIliIIlIIIIli * (float)Math.pow(1.15F, amount));
   }

   public void IIIllIIliIIl(float value) {
      this.iiIIIIIliIIlIIIIli = this.IlIillIiilIi(value);
   }

   private float IIIilIIiiIIi(float p) {
      return p < -this.iliiiiiIiIiiiiiiIi ? -this.iliiiiiIiIiiiiiiIi : (p > this.iliiiiiIiIiiiiiiIi ? this.iliiiiiIiIiiiiiiIi : p);
   }

   private static float IiIiliIiiiIi(float rate, float target, float dt, float current) {
      float var4 = rate + (target - rate) * (1.0F - (float)Math.exp((double)(-dt * current)));
      return Math.abs(target - var4) < 0.001F ? target : var4;
   }

   public float Ililllililil() {
      return this.iiIIIIIliIIlIIIIli;
   }

   public float Iilllilliill() {
      return this.IIIIIIIlilIIIIIIli;
   }

   public void IlIlllIlilIl() {
      this.llIIIIIliilIIIIIli = this.llliiiiIiilliiiiIi + (float)Math.round((this.liiiiiiIiiiiiiiiIi - this.llliiiiIiilliiiiIi) / 360.0F) * 360.0F;
      this.IiIIIIIliliIIIIIli = this.IiliiiiIililiiiiIi;
      this.iiIIIIIliIIlIIIIli = this.iiliiiiIiIIiiiiiIi;
      this.lIlIIIIliiIlIIIIli = 0.0F;
      this.IllIIIIlilllIIIIli = 0.0F;
   }

   public float IIillIiliIil() {
      return this.iIIIIIIliIlIIIIIli;
   }

   public iIIllilIlIllil(float maxZoom, float minZoom, float pitch, float zoom, float yaw) {
      this(maxZoom, minZoom, pitch, zoom, yaw, 35.0F);
   }

   public void liiiIIllIl() {
      this.lilIIIIliiilIIIIli = true;
      this.lIlIIIIliiIlIIIIli = 0.0F;
      this.IllIIIIlilllIIIIli = 0.0F;
   }

   public iIIllilIlIllil IliIlllilIi(float degreesPerSecond) {
      this.illIIIIliIilIIIIli = degreesPerSecond;
      return this;
   }

   public float Illlllllilll() {
      return this.liiiiiiIiiiiiiiiIi;
   }

   public void iIlIlllllill(double dx, double dy) {
      float var5 = lIIliliIIlil.IliIlllilIi(dx);
      this.llIIIIIliilIIIIIli += var5;
      this.IllIIIIlilllIIIIli += var5;
      this.IiIIIIIliliIIIIIli = this.IIIilIIiiIIi(this.IiIIIIIliliIIIIIli + lIIliliIIlil.liiiIIllIl(dy));
   }

   public void IilliliilIIi() {
      this.lilIIIIliiilIIIIli = false;
      if (Math.abs(this.lIlIIIIliiIlIIIIli) < 12.0F) {
         this.lIlIIIIliiIlIIIIli = 0.0F;
      }

      this.lIlIIIIliiIlIIIIli = Math.max(-720.0F, Math.min(720.0F, this.lIlIIIIliiIlIIIIli));
   }

   public float Iiilliiliiil() {
      return this.lIlIIIIliiIlIIIIli;
   }

   private float IlIillIiilIi(float z) {
      return z < this.lIiiiiiIiiIiiiiiIi ? this.lIiiiiiIiiIiiiiiIi : (z > this.IliiiiiIilliiiiiIi ? this.IliiiiiIilliiiiiIi : z);
   }

   public void IiIlliIliiIl() {
      this.liiiiiiIiiiiiiiiIi = this.llIIIIIliilIIIIIli = this.llliiiiIiilliiiiIi;
      this.IIIIIIIlilIIIIIIli = this.IiIIIIIliliIIIIIli = this.IiliiiiIililiiiiIi;
      this.iIIIIIIliIlIIIIIli = this.iiIIIIIliIIlIIIIli = this.iiliiiiIiIIiiiiiIi;
      this.lIlIIIIliiIlIIIIli = 0.0F;
      this.IllIIIIlilllIIIIli = 0.0F;
      this.lilIIIIliiilIIIIli = false;
   }

   public boolean lIiiIiIlilli() {
      return this.lilIIIIliiilIIIIli;
   }
}

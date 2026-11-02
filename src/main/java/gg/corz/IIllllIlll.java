package gg.corz;

public final class IIllllIlll {
   private long iIilillIlilill;
   private int Iiilillliilill;
   private boolean IIIIIillIIIIil;
   private int llilillililill;
   private float Iliiilllliiill;
   private int iiliillIIiiill = -1;
   private boolean lIIiilliIIiill;
   private boolean liiiilliiiiill;
   private boolean Iiliillliliill;
   private boolean ilIiillIiIiill;
   private boolean lIiiilliIiiill;
   private float iliiillIiiiill;
   private long llliillilliill;
   private long iIIIIilIlIIIil = -1L;
   private boolean iiilillIIIiill;
   private llIIiiililIIiiil IIliilllIliill;
   private boolean IlIiillllIiill;
   private boolean llIIIililIIIil;
   private boolean liIiilliiIiill;
   private boolean iIliillIlliill;

   public long Iilllilliill() {
      return this.iIilillIlilill;
   }

   public boolean Iilililiiili() {
      return this.Iiilillliilill > 0;
   }

   public void IlIlllIlilIl() {
      this.llIIIililIIIil = true;
   }

   public boolean lIlIliIlIl() {
      return this.IIIIIillIIIIil;
   }

   public void IIIIllIIIl(int slot) {
      this.iiliillIIiiill = slot;
   }

   public int IIillIiliIil() {
      return this.llilillililill;
   }

   private void IIiIllIiIl() {
      this.llilillililill = 0;
      this.Iiilillliilill = 0;
      this.iiilillIIIiill = false;
      this.lIIiilliIIiill = false;
      this.IlIiillllIiill = false;
      this.ilIiillIiIiill = false;
      this.liIiilliiIiill = false;
      this.IIliilllIliill = null;
   }

   public boolean iIIIlIlIIl() {
      return this.lIiiilliIiiill;
   }

   public float llIIlilIIl() {
      return this.Iliiilllliiill;
   }

   public boolean Iiilliiliiil() {
      return this.lIIiilliIIiill;
   }

   public void lIiiIiIlilli(int own, boolean slot) {
      this.Iiilillliilill++;
      this.iiliillIIiiill = own;
      if (!slot) {
         this.iiilillIIIiill = true;
      }
   }

   public boolean IIlllIlliIll() {
      return this.llIIIililIIIil;
   }

   public float IiIIlliIIl() {
      return this.iliiillIiiiill;
   }

   public long IllIllllIl() {
      return this.iIIIIilIlIIIil;
   }

   public void IIIllIIliIIl(boolean right, boolean sneak, boolean back, boolean jump, boolean sprint, boolean forward, boolean left) {
      this.liiiilliiiiill = forward;
      this.IIIIIillIIIIil = left;
   }

   public llIIiiililIIiiil IiIiliIiiiIi() {
      return this.IIliilllIliill;
   }

   public void IiIlliIliiIl() {
      this.llIIIililIIIil = false;
   }

   public void Illlllllilll(llIIiiililIIiiil kind) {
      if (kind != null && kind.IliIlllilIi()) {
         this.illIlIilIl(kind, true);
         this.ilIiillIiIiill = true;
      }
   }

   public void iIlIlllllill() {
      this.lilIliilIl();
      this.Iiliillliliill = true;
   }

   private void lilIliilIl() {
      this.iIilillIlilill++;
      this.IIiIllIiIl();
   }

   public void iliIiiliiiii(float yaw, float pitch) {
      this.lIiiilliIiiill = true;
      this.Iliiilllliiill = yaw;
      this.iliiillIiiiill = pitch;
   }

   public boolean iiIIlIIlIl() {
      return this.liiiilliiiiill;
   }

   public boolean IIlilIliiIli() {
      return this.liIiilliiIiill;
   }

   public void liiiIIllIl(long clientTick) {
      if (!this.iIliillIlliill || clientTick != this.llliillilliill) {
         if (!this.Iiliillliliill) {
            this.lilIliilIl();
         }

         this.Iiliillliliill = false;
         this.iIliillIlliill = true;
         this.llliillilliill = clientTick;
      }
   }

   public void IliIlllilIi() {
      this.IIiIllIiIl();
      this.iIliillIlliill = false;
      this.llliillilliill = 0L;
      this.Iiliillliliill = false;
      this.iiliillIIiiill = -1;
      this.lIiiilliIiiill = false;
      this.Iliiilllliiill = 0.0F;
      this.iliiillIiiiill = 0.0F;
      this.liiiilliiiiill = false;
      this.IIIIIillIIIIil = false;
      this.iIIIIilIlIIIil = -1L;
      this.llIIIililIIIil = false;
   }

   public int Iiiiliiiiiii() {
      return this.iiliillIIiiill;
   }

   public boolean Ililllililil() {
      return this.llilillililill > 0;
   }

   public void IilliliilIIi(llIIiiililIIiiil own, boolean kind, boolean held) {
      if (held) {
         this.liIiilliiIiill = true;
      }

      if (own != null && own.IliIlllilIi()) {
         this.illIlIilIl(own, kind);
      }
   }

   private void illIlIilIl(llIIiiililIIiiil own, boolean kind) {
      this.llilillililill++;
      if (this.IIliilllIliill == null) {
         this.IIliilllIliill = own;
      }

      if (kind) {
         this.lIIiilliIIiill = true;
         this.iIIIIilIlIIIil = this.iIilillIlilill;
      } else {
         this.IlIiillllIiill = true;
      }
   }

   public boolean IIIilIIiiIIi() {
      return this.IlIiillllIiill;
   }

   public boolean IlIillIiilIi() {
      return this.ilIiillIiIiill;
   }

   public boolean Illillliilli() {
      return this.llilillililill == 0;
   }

   public boolean IIiilIiiiIii() {
      return this.iiilillIIIiill;
   }

   public boolean Iliilliiilii() {
      return this.llilillililill == 0 && this.Iiilillliilill == 0;
   }
}

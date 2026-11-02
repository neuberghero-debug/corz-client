package gg.corz;

import java.util.Collections;
import java.util.Set;

public final class iIlIIIllIllIIIll {
   private boolean IiiiliIlll;
   private final IIiliIlllIiliIll IliiliIlll;
   private lIIiIIIiiIIiIIIi lliiliIlll;
   private String iliiliIlll = "";
   private IIIIliilIIIlii liiiliIlll;

   public boolean Ililllililil() {
      return this.lliiliIlll != null;
   }

   public iIlIIIllIllIIIll(IIiliIlllIiliIll transport) {
      this.IliiliIlll = transport;
   }

   public boolean lIiiIiIlilli(llIillIlilIillIl ctx, boolean host) {
      return this.lliiliIlll != null && this.lliiliIlll.Iillllilll(ctx, host);
   }

   public boolean Iilllilliill() {
      return this.lliiliIlll != null && this.lliiliIlll.IiiIlliiIl();
   }

   public boolean IlIillIiilIi(int z, int y, int x) {
      return this.lliiliIlll == null || this.lliiliIlll.iIIilIlIil(z, y, x);
   }

   public void IiIlliIliiIl(llIillIlilIillIl ctx) {
      if (this.lliiliIlll != null) {
         if (this.IIIIllIIIl(ctx)) {
            ctx.IllIllllIl(
               llIIlilIIl<"llIIlilIIl","wxz2DvFgrOxMjcCf/VzRZdXUpBYX+nxRqjJRFpxgJxAA+goYb8zu/1SwwVen+CFJRPuaXCr5J3HdahV+9lnMw8IZF2Vrw/EhfCoFoQ0kpAG6VHM/F972wV5v962bTuXniHPgIg==">()
            );
            this.iIlIlllllill();
         } else {
            this.iIIIlIlIIl(ctx);
            this.lliiliIlll.IIIllIIliIIl(ctx);
            if (this.lliiliIlll.Ilillllill()) {
               this.iliiliIlll = this.lliiliIlll.liilliiill();
               this.IiiiliIlll = true;
               this.liiiliIlll = this.lliiliIlll.liiiIIllIl();
               this.lliiliIlll = null;
            }
         }
      }
   }

   private void iIIIlIlIIl(llIillIlilIillIl ctx) {
      if (this.lliiliIlll != null && this.lliiliIlll.iiiIlIIIll()) {
         llIIliIiilIIliIi var2 = ctx.Ililllililil();
         if (var2 != null && var2.IliIlllilIi()) {
            if (this.lliiliIlll.lIIlliIIll() == null || !this.lliiliIlll.lIIlliIIll().liiiIIllIl(var2)) {
               this.lliiliIlll.lIilliIill();
            }
         }
      }
   }

   public boolean Iilililiiili(int staleMs, int z, int y, long x) {
      return this.lliiliIlll != null && this.lliiliIlll.Illillllil(staleMs, z, y, x);
   }

   public boolean Iliilliiilii() {
      return this.lliiliIlll != null && this.lliiliIlll.lililiilil();
   }

   public void IliIlllilIi(llIillIlilIillIl ctx) {
      this.iIlIlllllill();
      this.Illlllllilll();
      this.lliiliIlll = new lIIiIIIiiIIiIIIi(ctx, true, this.IliiliIlll);
      this.lliiliIlll.lIiiIiIlilli();
   }

   public void IIlilIliiIli(String reason) {
      if (this.lliiliIlll != null) {
         this.lliiliIlll.IiIilliIil(reason);
      }
   }

   public lIIiIIIiiIIiIIIi Iiilliiliiil() {
      return this.lliiliIlll;
   }

   public boolean IlIlllIlilIl() {
      return this.lliiliIlll != null && this.lliiliIlll.iilllIIill();
   }

   public boolean IIlllIlliIll(llIillIlilIillIl ctx) {
      if (!this.IiiiliIlll) {
         return false;
      } else {
         if (this.liiiliIlll != null && ctx != null && ctx.IliIlllilIi()) {
            IIIIliilIIIlii var2 = ctx.IIillIiliIil();
            if (var2 != null && !this.liiiliIlll.iIlIlllllill(var2)) {
               this.Illlllllilll();
               return false;
            }
         }

         return true;
      }
   }

   public String Illillliilli(int z, int x, int y) {
      return this.lliiliIlll == null ? null : this.lliiliIlll.iiIilIIlil(z, x, y);
   }

   public IIIIliilIIIlii IIIilIIiiIIi() {
      return this.lliiliIlll == null ? null : this.lliiliIlll.liiiIIllIl();
   }

   public String IilliliilIIi() {
      return this.iliiliIlll;
   }

   public void IiIiliIiiiIi(int z, int x, int y) {
      if (this.lliiliIlll != null) {
         this.lliiliIlll.llIililIil(z, x, y);
      }
   }

   public void iIlIlllllill() {
      if (this.lliiliIlll != null) {
         this.iliiliIlll = this.lliiliIlll.liilliiill();

         try {
            this.lliiliIlll.iliIiiliiiii();
         } catch (Exception var2) {
         }

         this.lliiliIlll = null;
      }
   }

   public boolean IIIllIIliIIl() {
      return this.lliiliIlll != null && this.lliiliIlll.iiiIlIIIll();
   }

   public iIlIIIllIllIIIll() {
      this(new iIiliIllIliliIll());
   }

   public void Illlllllilll() {
      this.IiiiliIlll = false;
      this.liiiliIlll = null;
   }

   private boolean IIIIllIIIl(llIillIlilIillIl ctx) {
      if (!ctx.IliIlllilIi()) {
         return true;
      } else {
         IIIIliilIIIlii var2 = this.lliiliIlll.liiiIIllIl();
         return var2 != null && !var2.iIlIlllllill(ctx.IIillIiliIil());
      }
   }

   public Set<Long> Iiiiliiiiiii() {
      return this.lliiliIlll == null ? Collections.emptySet() : this.lliiliIlll.IIiillIiil();
   }

   public boolean iliIiiliiiii() {
      return this.lliiliIlll != null && this.lliiliIlll.IlIllllIll();
   }

   public boolean IIiilIiiiIii() {
      return this.lliiliIlll != null && this.lliiliIlll.illilIilil();
   }

   public boolean IIillIiliIil() {
      return this.lliiliIlll != null && this.lliiliIlll.lliIliliIl();
   }

   public void liiiIIllIl(llIillIlilIillIl ctx) {
      this.iIlIlllllill();
      this.Illlllllilll();
      this.lliiliIlll = new lIIiIIIiiIIiIIIi(ctx, false, this.IliiliIlll);
      this.lliiliIlll.lIiiIiIlilli();
   }
}

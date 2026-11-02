package gg.corz;

import java.util.Locale;

public final class iiIIilIIlIil {
   private final long iIlilIliIllilIli;
   private final long IililIlilililIli;
   private final int iililIliIIiilIli;
   private final int lIiilIliiIiilIli;
   private int IIIIiIlilIIIiIli;
   private int liiilIliiiiilIli;
   private final IIiIlIilIiIlIi lllilIliillilIli;
   private iiiilllIIIIill IliilIlilliilIli = iiiilllIIIIill.iIlillIIiIllillIIi;
   private String iliilIliIiiilIli = "";

   public long IilliliilIIi() {
      return this.lllilIliillilIli.IIIllIIliIIl();
   }

   public long iIlIlllllill() {
      return this.lllilIliillilIli.iliIiiliiiii();
   }

   public iiiilllIIIIill iliIiiliiiii() {
      return this.IliilIlilliilIli;
   }

   public void IIlllIlliIll(int tick) {
      if (this.IliilIlilliilIli == iiiilllIIIIill.iIlillIIiIllillIIi) {
         this.IliilIlilliilIli = iiiilllIIIIill.lllillIIiillillIIi;
         this.liiilIliiiiilIli = tick;
      }
   }

   public long lIiiIiIlilli() {
      return this.IililIlilililIli;
   }

   public String IlIlllIlilIl() {
      return this.iliilIliIiiilIli;
   }

   public boolean IIIllIIliIIl() {
      return this.IliilIlilliilIli == iiiilllIIIIill.iIlillIIiIllillIIi || this.IliilIlilliilIli == iiiilllIIIIill.lllillIIiillillIIi;
   }

   public IIiIlIilIiIlIi liiiIIllIl() {
      return this.lllilIliillilIli;
   }

   public void Iilllilliill(String tick, int reason) {
      if (this.IIIllIIliIIl()) {
         this.IliilIlilliilIli = iiiilllIIIIill.iilillIIiIIiillIIi;
         this.iliilIliIiiilIli = tick == null ? "" : tick;
         this.IIIIiIlilIIIiIli = reason;
      }
   }

   public int IiIlliIliiIl() {
      return this.lIiilIliiIiilIli;
   }

   public String IIillIiliIil() {
      return String.format(
         Locale.ROOT,
         Ililllililil<"Ililllililil","yPljJF4SPS+xL9ZASzJx4ByhdI05nJuoaRuP0h54t1tLb3PyJTRYW6ndgjrIRJrqhDtM9qkpQNVQqWDeNt9s/h8qJ4FnmGFizFymIPcN0GfhLnW+PrAO8dptD7gW5pxVrVKFykdUgZiGCPoqUnm5ciJkT7g/qtQaC3+lCXUiBqyPkWQvjCC6maRIhMnC2MW0FKMjCoPXwSW3AwJt1UZ4XXCC+ltufP11ioIe9hZ9jIJJpE++oThNpBCT1HkF54H8sf0/VmRQdGtusuMg9SDiCLGDrH5nUKlnokMio/FvYQ==">(),
         this.iIlilIliIllilIli,
         this.IliilIlilliilIli,
         this.lllilIliillilIli.lIiiIiIlilli(),
         this.lllilIliillilIli.iliIiiliiiii(),
         this.lllilIliillilIli.IIIllIIliIIl(),
         this.lllilIliillilIli.Iilllilliill(),
         this.lllilIliillilIli.IiIlliIliiIl(),
         this.lllilIliillilIli.IIlllIlliIll(),
         this.IililIlilililIli,
         this.iililIliIIiilIli,
         (this.IIIIiIlilIIIiIli >= 0 ? this.IIIIiIlilIIIiIli : Math.max(this.lIiilIliiIiilIli, this.liiilIliiiiilIli)) - this.lIiilIliiIiilIli,
         this.iliilIliIiiilIli.isEmpty() ? "" : Ililllililil<"Ililllililil","vg3iH61XwQ5wXOShZRQGnKmOavb6Ix147ISYb4358IaSYZyj">() + this.iliilIliIiiilIli
      );
   }

   public long IliIlllilIi() {
      return this.iIlilIliIllilIli;
   }

   public iiIIilIIlIil(long createdTick, IIiIlIilIiIlIi id, long alternative, int refusedTarget, int refusedRouteLen) {
      this.liiilIliiiiilIli = -1;
      this.IIIIiIlilIIIiIli = -1;
      this.iIlilIliIllilIli = createdTick;
      this.lllilIliillilIli = id;
      this.IililIlilililIli = alternative;
      this.iililIliIIiilIli = refusedTarget;
      this.lIiilIliiIiilIli = refusedRouteLen;
   }

   public boolean Illlllllilll(long cell, int tick) {
      if (this.IIIllIIliIIl() && cell == this.lllilIliillilIli.iliIiiliiiii()) {
         this.IliilIlilliilIli = iiiilllIIIIill.IilillIIililillIIi;
         this.IIIIiIlilIIIiIli = tick;
         return true;
      } else {
         return false;
      }
   }
}

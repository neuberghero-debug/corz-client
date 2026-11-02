package gg.corz;

import java.util.EnumSet;
import java.util.Set;

public final class iIIiiiIlIlIiiiIl {
   private boolean llllIiIlll;
   private lIlllliIllll IlllIiIlll;
   private boolean lillIiIlll;
   private int IIilIiIlll;
   private final Set<iilillIIiill> IillIiIlll = EnumSet.noneOf(iilillIIiill.class);
   private boolean illlIiIlll;
   private boolean iillIiIlll;

   public static boolean iliIiiliiiii(boolean gapJump, boolean inScaffold, boolean localRecovery) {
      return gapJump || inScaffold || localRecovery;
   }

   public void IliIlllilIi() {
      this.IlllIiIlll = null;
      this.llllIiIlll = false;
      this.illlIiIlll = false;
      this.IillIiIlll.clear();
      this.lillIiIlll = false;
      this.iillIiIlll = false;
      this.IIilIiIlll = 0;
   }

   public boolean IilliliilIIi(iilillIIiill why) {
      return this.IillIiIlll.contains(why);
   }

   public lIlllliIllll Illlllllilll() {
      return this.IlllIiIlll;
   }

   public boolean IlIlllIlilIl() {
      if (!this.lillIiIlll) {
         this.lillIiIlll = true;
         this.iillIiIlll = this.llllIiIlll && (this.illlIiIlll || this.IillIiIlll.isEmpty());
      }

      return this.iillIiIlll;
   }

   public boolean Iilllilliill() {
      return this.llllIiIlll;
   }

   public void iIlIlllllill(iilillIIiill why) {
      if (this.lillIiIlll) {
         this.IIilIiIlll++;
      } else {
         this.IillIiIlll.add(why);
      }
   }

   public void liiiIIllIl(lIlllliIllll owner, boolean certified) {
      if (this.lillIiIlll) {
         this.IIilIiIlll++;
      } else {
         if (!this.llllIiIlll || certified && !this.illlIiIlll) {
            this.IlllIiIlll = owner;
            this.illlIiIlll = certified;
         }

         this.llllIiIlll = true;
      }
   }

   public boolean IIlllIlliIll() {
      return this.iillIiIlll;
   }

   public boolean Iiilliiliiil() {
      return this.lillIiIlll && this.llllIiIlll && !this.illlIiIlll && !this.IillIiIlll.isEmpty();
   }

   public static lIlllliIllll lIiiIiIlilli(boolean inScaffold, boolean localRecovery, boolean gapJump) {
      if (inScaffold) {
         return lIlllliIllll.IIiliIIilIiliIIi;
      } else if (localRecovery) {
         return lIlllliIllll.lliliIIiililiIIi;
      } else {
         return gapJump ? lIlllliIllll.lilliIIiiilliIIi : lIlllliIllll.illliIIiIilliIIi;
      }
   }

   public boolean IIillIiliIil() {
      return this.illlIiIlll;
   }

   public int Ililllililil() {
      return this.IIilIiIlll;
   }

   public boolean IiIlliIliiIl() {
      return this.lillIiIlll;
   }

   public boolean IIIllIIliIIl() {
      long var2 = -8241303173394305355L;
      var2 ^= ((long)this.IlIlllIlilIl() << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) != 0 && !this.IilliliilIIi(iilillIIiill.lIiIIiIiiIiIIiIi);
   }
}

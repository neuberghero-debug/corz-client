package gg.corz;

public final class iIiiliIliili {
   public static final int lIIIlllIliIIIlllIl = 10;
   public static final float ilIIlllIlIiIIlllIl = 12.0F;
   public static final double liIIlllIliiIIlllIl = 0.6;
   public static final int IIlIlllIllIlIlllIl = 6;
   private static final iiiiiIIlIIIIIlIl iIlIlllIlIllIlllIl = new iiiiiIIlIIIIIlIl(
      true, IIIllIIliIIl<"IIIllIIliIIl","vLR54xLZEjR2me8F73eBYtf311V4WnU/i1hELgsH">()
   );
   public static final int IlIIlllIlllIIlllIl = 3;

   public static boolean iIlIlllllill(
      IlIIIlilllIIIlil style, lliiilIiiliiilIi fightRange, liiilIiliiiilIil target, boolean self, double defensiveOrEscape, double keepRange
   ) {
      if (fightRange != null && IilliliilIIi(target) && !target.lliIliliIl()) {
         if (!(target.Illlllllilll() <= keepRange)) {
            return false;
         } else {
            return fightRange.IIillIiliIil() >= 1 && !self ? style != IlIIIlilllIIIlil.liiIiilIil || target.Illlllllilll() <= defensiveOrEscape : false;
         }
      } else {
         return false;
      }
   }

   private static boolean lIiiIiIlilli(iIliIiIiIlliIiIi s) {
      return s == iIliIiIiIlliIiIi.iilIiIiIIi || s == iIliIiIiIlliIiIi.IIiIiIiIIi || s == iIliIiIiIlliIiIi.iIiIiIiIIi;
   }

   static boolean IilliliilIIi(liiilIiliiiilIil target) {
      if (target == null) {
         return false;
      } else {
         return target.lIiiIiIlilli() == null ? true : target.lIiiIiIlilli().method_5805() && !target.lIiiIiIlilli().method_31481();
      }
   }

   public static iiiIiiIlIIIliiIl IliIlllilIi(iIliiiiIlliiii in) {
      long var2 = -6221768196890086421L;
      if (in != null && in.IliIlllilIi() != null && in.IliIlllilIi() != iIliIiIiIlliIiIi.lllIiIiIIi) {
         var2 ^= ((long)iliIiiliiiii(in.IIillIiliIil()) << 32 ^ var2) & -1L << 32;
         if (in.liiiIIllIl()) {
            return iiiIiiIlIIIliiIl.iliiIlIlll;
         } else if (in.iIlIlllllill() > 10 || in.IliIlllilIi() == iIliIiIiIlliIiIi.IliIiIiIIi && in.IilliliilIIi() <= 3) {
            if ((double)in.lIiiIiIlilli() > ililiilIiiliil.llIiIllliilIiIllli[(int)(var2 >>> 32)] && (!(in.lIiiIiIlilli() <= 12.0F) || in.iliIiiliiiii())) {
               if (in.IiIlliIliiIl()) {
                  return iiiIiiIlIIIliiIl.iiiiIlIlll;
               } else if (in.IIlllIlliIll()) {
                  return iiiIiiIlIIIliiIl.IIIIllIlll;
               } else if (!in.Illlllllilll()) {
                  return iiiIiiIlIIIliiIl.lIIIllIlll;
               } else if (in.IIIllIIliIIl() > 0 && (in.IlIlllIlilIl() > 0 || lIiiIiIlilli(in.IliIlllilIi()))) {
                  return in.Iilllilliill() >= 600 ? iiiIiiIlIIIliiIl.IlIIllIlll : iiiIiiIlIIIliiIl.lliiIlIlll;
               } else {
                  return iiiIiiIlIIIliiIl.iIIIllIlll;
               }
            } else {
               return iiiIiiIlIIIliiIl.liiiIlIlll;
            }
         } else {
            return iiiIiiIlIIIliiIl.IiiiIlIlll;
         }
      } else {
         return iiiIiiIlIIIliiIl.lliiIlIlll;
      }
   }

   private iIiiliIliili() {
   }

   private static int iliIiiliiiii(IlIIIlilllIIIlil style) {
      return (style == null ? IlIIIlilllIIIlil.iliIiilIil : style).ordinal();
   }

   public static iiiiiIIlIIIIIlIl liiiIIllIl(
      IlIIIlilllIIIlil target,
      lliiilIiiliiilIi lift,
      IlIillllIill friendNearTarget,
      liiilIiliiiilIil threat,
      boolean self,
      boolean launchVariant,
      boolean style,
      IiIllIilliIllIil inLiquidOrWeb
   ) {
      long var10 = -6694806928585384900L;
      if (lift == null) {
         return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<"IIIllIIliIIl","3aRg+8/730T7TlYnpLShjEYubie82Ll472QaJv4hm3k=">());
      } else {
         var10 ^= ((long)iliIiiliiiii(target) << 32 ^ var10) & -1L << 32;
         IlIillllIill var9 = friendNearTarget == null ? IlIillllIill.IIIIilIilIIIilIi : friendNearTarget;
         if (!lift.Iilllilliill()) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<"IIIllIIliIIl","Zpzs6CqrUyn+GiaUv1Fb9ewP/QyooeILw1pLQFdCSiaL">());
         } else if (!((double)lift.IliIlllilIi() >= ililiilIiiliil.liilIllliiiilIllli[(int)(var10 >>> 32)])) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<"IIIllIIliIIl","O27OmOjxlrTrlSMy9PdEFTn4+rkF0M3xHRwhfJdPGQ==">());
         } else if (lift.IIillIiliIil() < ililiilIiiliil.IIIiIlllilIIiIllli[(int)(var10 >>> 32)]) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<"IIIllIIliIIl","Xm0lbgXO3gfPcbqCcoZn4mpeKfJxqUAYKAC8Ak3JmABmTA==">());
         } else if (lift.Ililllililil() < 8) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<"IIIllIIliIIl","HYNMFbio2wazg4kS2tH71nCjrZHHzkgiLs0SoUcmyFJ11E8D">());
         } else if (!((double)var9.IliIlllilIi() <= 0.6 * (double)lift.IliIlllilIi())) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<"IIIllIIliIIl","5AgEusPbPi0s6FRGTtSS91Vrw8MlOOxnUE6gWY4DReow0g==">());
         } else if (lift.iiIIlIIlIl()) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<"IIIllIIliIIl","QNV40CZweZ/rsyVsILiXlg1iAekTRApzBNHM4bnHnt39">());
         } else if (lift.Iiiiliiiiiii() <= 6) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<"IIIllIIliIIl","9K3xCnIbLtggJ3cgJBnDqsKiWkop7RgfSumFo3BQbt4=">());
         } else if (launchVariant) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<"IIIllIIliIIl","mzWDR/AIPLVSwOiUlKzlTo5sND92kpHegstqPI8c1nNrjA==">());
         } else if (!IilliliilIIi(threat)) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<"IIIllIIliIIl","TNLvdpsZkMBCKGuw1JOC5FGfwO5rH5CA5ft6n8pqxSIuOA==">());
         } else if (threat.lliIliliIl()) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<"IIIllIIliIIl","Xizk+5MAXRj5Bf6fiw80Y3/mRlBOLengrsHPCRsRghJP3A==">());
         } else if (self) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<"IIIllIIliIIl","ugbKqcpf25SLL/HjNeOPBmgPVj4ybHRcgwoxHTeBfjJ0pg==">());
         } else {
            return !style || inLiquidOrWeb != null && inLiquidOrWeb != IiIllIilliIllIil.iiIilIlIil
               ? iIlIlllIlIllIlllIl
               : new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<"IIIllIIliIIl","zishSnCckBy5Q5WH5yfDvTj5My1WdZUlS1DbhtUcJBk=">());
         }
      }
   }
}

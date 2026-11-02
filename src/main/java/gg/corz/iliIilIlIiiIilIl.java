package gg.corz;

public final class iliIilIlIiiIilIl {
   public static final String llliillIll = "lava-locked";
   public static final String iIliillIll = "lava";
   public static final int lIliillIll = 32;
   public static final String liliillIll = "deep";
   public static final String IlliillIll = "trap";
   public static final String illiillIll = "underwater";
   public static final String IiliillIll = "protected";
   public static final String lIiiillIll = "hidden";
   public static final String iiliillIll = "unreachable";
   public static final int IIliillIll = 4;
   public static final String IIiiillIll = "hard";

   public static boolean iIlIlllllill(lIilIiliIilIil z, int y, int x, int c) {
      for (int var4 = -4; var4 <= 4; var4++) {
         for (int var5 = -4; var5 <= 4; var5++) {
            for (int var6 = -4; var6 <= 4; var6++) {
               if ((var4 != 0 || var5 != 0 || var6 != 0) && lIilIiliIilIil.liiiIIllIl(z.IliIlllilIi(y + var4, x + var5, c + var6), 16)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public static boolean liiiIIllIl(lIilIiliIilIil z, int x, int y, int c) {
      return lIilIiliIilIil.liiiIIllIl(z.IliIlllilIi(x + 1, y, c), 2)
         || lIilIiliIilIil.liiiIIllIl(z.IliIlllilIi(x - 1, y, c), 2)
         || lIilIiliIilIil.liiiIIllIl(z.IliIlllilIi(x, y + 1, c), 2)
         || lIilIiliIilIil.liiiIIllIl(z.IliIlllilIi(x, y - 1, c), 2)
         || lIilIiliIilIil.liiiIIllIl(z.IliIlllilIi(x, y, c + 1), 2)
         || lIilIiliIilIil.liiiIIllIl(z.IliIlllilIi(x, y, c - 1), 2);
   }

   private iliIilIlIiiIilIl() {
   }

   public static Iiiililiiili IliIlllilIi(lIilIiliIilIil ay, int ax, int protectedSpot, int dig, int stands, lliIllliliIlll c, boolean feetY, boolean az) {
      if (az) {
         return Iiiililiiili.IliIlllilIi(IilliliilIIi<"IilliliilIIi","XCHccyBh3OGkDG9JrKbs4YuIiW/3fpq9++bGy5+6IYhzlYfKPQ==">());
      } else if (liiiIIllIl(ay, ax, protectedSpot, dig)) {
         return Iiiililiiili.IliIlllilIi(IilliliilIIi<"IilliliilIIi","jW0djKZiyxlqnBj4OVU5P5mklWqf6GNAdHBOEhGLefM=">());
      } else if (iIlIlllllill(ay, ax, protectedSpot, dig)) {
         return Iiiililiiili.IliIlllilIi(IilliliilIIi<"IilliliilIIi","LWvTC3wEj6V6NEsPco66Bdr5Q580w16miMLMjyXNzhg=">());
      } else if (stands - protectedSpot > ((964751809 ^ 109) * -19 ^ -1150414820)) {
         return Iiiililiiili.IliIlllilIi(IilliliilIIi<"IilliliilIIi","svxT9/c3m8BhAOr7/pYLRSfhBISypJlwmB++5U53zcI=">());
      } else if (c == null) {
         return Iiiililiiili.IliIlllilIi(IilliliilIIi<"IilliliilIIi","GnS2Dg351m2zSX0KgDCBUcRAjWLXOIv4iFxzpZeUWHz7CLIDKGIk">());
      } else if (!c.IilliliilIIi().isEmpty()) {
         return Iiiililiiili.llIllllIlilIllllIl;
      } else if (feetY && !c.lIiiIiIlilli().isEmpty()) {
         return Iiiililiiili.llIllllIlilIllllIl;
      } else if (!feetY && !c.lIiiIiIlilli().isEmpty()) {
         return Iiiililiiili.IliIlllilIi(IilliliilIIi<"IilliliilIIi","dricQSwZQcte8gqVBOxTEAsK3H0ur7kvMA5z3bF74I19cQ==">());
      } else if (c.IlIlllIlilIl() > 0 && c.iliIiiliiiii() <= c.IlIlllIlilIl() + c.IIIllIIliIIl()) {
         return Iiiililiiili.IliIlllilIi(IilliliilIIi<"IilliliilIIi","xWfk7kA/xb+Uj0j57bqw4QbyNBZME2z3bc3jDzmm5yhouyN3WTg=">());
      } else if (c.IIIllIIliIIl() > 0) {
         return Iiiililiiili.IliIlllilIi(IilliliilIIi<"IilliliilIIi","uBlf3v926IJ38Z97/fy85EJ+PkM8i6qadd88FEyolmKp8EWKNMX2">());
      } else {
         return c.IiIlliIliiIl() > 0
            ? Iiiililiiili.IliIlllilIi(IilliliilIIi<"IilliliilIIi","tBucW/UQUaoNDVNhByT6sc1lPplSTcbFpXbbaro/E0U=">())
            : Iiiililiiili.IliIlllilIi(IilliliilIIi<"IilliliilIIi","GnS2Dg351m2zSX0KgDCBUcRAjWLXOIv4iFxzpZeUWHz7CLIDKGIk">());
      }
   }
}

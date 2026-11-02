package gg.corz;

public final class ilIiiillIiIiiill {
   public static IlillIIillillIIi liiiIIllIl(IIiIliilIiIlii bot) {
      if (bot == null) {
         return IlillIIillillIIi.lIiIIIiiil;
      } else {
         try {
            IlillIIillillIIi var1 = bot.liIlliiIll();
            return var1 != null ? var1 : IlillIIillillIIi.lIiIIIiiil;
         } catch (RuntimeException var2) {
            return IlillIIillillIIi.lIiIIIiiil;
         }
      }
   }

   private ilIiiillIiIiiill() {
   }

   public static IlillIIillillIIi IliIlllilIi(ilIllIiIll m) {
      return m instanceof IIiIliilIiIlii var1 ? liiiIIllIl(var1) : null;
   }
}

package gg.corz;

public final class iIiIlIiIliIlIi {
   public static final float iIiiIlIiiIliiIlIii = 9.0F;

   public static int iIlIlllllill(float scaled) {
      return (int)Math.max(1.0F, scaled / 4.0F);
   }

   public static float IliIlllilIi(float enchantBonus, float crit, float charge, boolean attackDamage) {
      float var4 = enchantBonus * (0.2F + charge * charge * 0.8F);
      if (attackDamage) {
         var4 *= 1.5F;
      }

      return var4 + crit * charge;
   }

   private iIiIlIiIliIlIi() {
   }

   public static float liiiIIllIl(float charge, float enchantBonus, float crit, boolean meleeEpf, iiIllIlIIlllIl attackDamage, float a) {
      iiIllIlIIlllIl var6 = attackDamage == null ? iiIllIlIIlllIl.lliIilIlliliIilIll : attackDamage;
      return iiIiiliIIliili.lIiiIiIlilli(
         IliIlllilIi(charge, enchantBonus, crit, meleeEpf), new iiIllIlIIlllIl(var6.IliIlllilIi(), var6.liiiIIllIl(), var6.iIlIlllllill(), a, -1)
      );
   }
}

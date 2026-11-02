package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_243;

public record IlIillllIill(
   float maxIncoming,
   float liveMax,
   int liveCrystalId,
   class_243 liveCenter,
   class_2338 worstBase,
   float worstBaseDamage,
   float secondBaseDamage,
   float anchorMax,
   class_2338 chargedAnchor,
   float meleeMax,
   int etaTicks,
   boolean lethal,
   boolean lethalAfterTotem
) {
   private final boolean iliillIiIiiillIi;
   private final float IlIillIillIillIi;
   private final float lIiillIiiIiillIi;
   public static final IlIillllIill IIIIilIilIIIilIi = new IlIillllIill(0.0F, 0.0F, -1, null, null, 0.0F, 0.0F, 0.0F, null, 0.0F, 99, false, false);
   private final int IliillIilliillIi;
   private final float lllillIiillillIi;
   private final class_2338 IIlillIilIlillIi;
   private final float iIlillIiIllillIi;
   private final class_243 liIillIiiiIillIi;
   private final boolean liiillIiiiiillIi;
   private final float IilillIililillIi;
   private final class_2338 iilillIiIIiillIi;
   private final int ilIillIiIiIillIi;
   private final float lIIillIiiIIillIi;

   public float IliIlllilIi() {
      return this.lIIillIiiIIillIi;
   }

   public class_243 IilliliilIIi() {
      return this.liIillIiiiIillIi;
   }

   public float iliIiiliiiii() {
      return this.iIlillIiIllillIi;
   }

   public float liiiIIllIl() {
      return this.IlIillIillIillIi;
   }

   public int Illlllllilll() {
      return this.IliillIilliillIi;
   }

   public class_2338 lIiiIiIlilli() {
      return this.IIlillIilIlillIi;
   }

   public float IIIllIIliIIl() {
      return this.lllillIiillillIi;
   }

   public boolean IIillIiliIil() {
      return this.liiillIiiiiillIi;
   }

   public IlIillllIill(
      float maxIncoming,
      float liveMax,
      int liveCrystalId,
      class_243 liveCenter,
      class_2338 worstBase,
      float worstBaseDamage,
      float secondBaseDamage,
      float anchorMax,
      class_2338 chargedAnchor,
      float meleeMax,
      int etaTicks,
      boolean lethal,
      boolean lethalAfterTotem
   ) {
      this.lIIillIiiIIillIi = maxIncoming;
      this.IlIillIillIillIi = liveMax;
      this.ilIillIiIiIillIi = liveCrystalId;
      this.liIillIiiiIillIi = liveCenter;
      this.IIlillIilIlillIi = worstBase;
      this.iIlillIiIllillIi = worstBaseDamage;
      this.lllillIiillillIi = secondBaseDamage;
      this.IilillIililillIi = anchorMax;
      this.iilillIiIIiillIi = chargedAnchor;
      this.lIiillIiiIiillIi = meleeMax;
      this.IliillIilliillIi = etaTicks;
      this.iliillIiIiiillIi = lethal;
      this.liiillIiiiiillIi = lethalAfterTotem;
   }

   public class_2338 IiIlliIliiIl() {
      return this.iilillIiIIiillIi;
   }

   public float IIlllIlliIll() {
      return this.lIiillIiiIiillIi;
   }

   public int iIlIlllllill() {
      return this.ilIillIiIiIillIi;
   }

   public boolean Iilllilliill() {
      return this.iliillIiIiiillIi;
   }

   public float IlIlllIlilIl() {
      return this.IilillIililillIi;
   }
}

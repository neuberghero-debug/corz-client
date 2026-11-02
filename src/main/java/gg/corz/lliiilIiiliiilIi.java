package gg.corz;

import net.minecraft.class_238;
import net.minecraft.class_243;

public record lliiilIiiliiilIi(
   class_243 pos,
   class_243 eye,
   class_238 box,
   class_243 velocity,
   boolean onGround,
   float health,
   float absorption,
   iiIllIlIIlllIl armor,
   float armorMinDurability,
   boolean totemInOffhand,
   boolean totemConfirmed,
   int totems,
   int crystals,
   int obsidian,
   int anchors,
   int glowstone,
   int gapples,
   int food,
   int pearls,
   int xpBottles,
   boolean pearlReady,
   float swordCharge,
   int foodLevel,
   int ticksSinceFresh,
   float lastScaledTaken,
   int pops,
   long lastPopTick,
   boolean usingItem,
   boolean handSwapBusy,
   boolean inputMasked,
   IlillIllllillIll hole,
   int pingMs,
   double loopMs
) {
   private final int iIIlIilIIi;
   private final int lliIIilIIi;
   private final int IiIlIilIIi;
   private final float liIlIilIIi;
   private final double IillIilIIi;
   private final int IIIlIilIIi;
   private final int liiIIilIIi;
   private final float lilIIilIIi;
   private final boolean IlllIilIIi;
   private final int iliIIilIIi;
   private final class_243 iIlIIilIIi;
   private final boolean lIllIilIIi;
   private final boolean iIllIilIIi;
   private final long IIllIilIIi;
   private final IlillIllllillIll llllIilIIi;
   private final int lIIlIilIIi;
   private final float IIiIIilIIi;
   private final boolean illIIilIIi;
   private final class_243 lllIIilIIi;
   private final float llIlIilIIi;
   private final boolean IlIlIilIIi;
   private final int IliIIilIIi;
   private final int iiiIIilIIi;
   private final int illlIilIIi;
   private final boolean iIiIIilIIi;
   private final int iiIlIilIIi;
   private final class_243 lIlIIilIIi;
   private final boolean lIiIIilIIi;
   private final int IiiIIilIIi;
   private final int ilIlIilIIi;
   private final class_238 IllIIilIIi;
   private final iiIllIlIIlllIl iilIIilIIi;
   private final float IilIIilIIi;

   public boolean lIlIliIlIl() {
      return this.iIllIilIIi;
   }

   public class_238 IilliliilIIi() {
      return this.IllIIilIIi;
   }

   public int Iilililiiili() {
      return this.iIIlIilIIi;
   }

   public boolean IllIllllIl() {
      return this.IlllIilIIi;
   }

   public int IIIIllIIIl() {
      return this.IiIlIilIIi;
   }

   public float IIlllIlliIll() {
      return this.IIiIIilIIi;
   }

   public int IiIiliIiiiIi() {
      return this.iiiIIilIIi;
   }

   public boolean Illlllllilll() {
      return this.lIiIIilIIi;
   }

   public int Illillliilli() {
      return this.lIIlIilIIi;
   }

   public int IIlilIliiIli() {
      return this.IIIlIilIIi;
   }

   public int Ililllililil() {
      return this.lliIIilIIi;
   }

   public boolean iliIiiliiiii() {
      return this.illIIilIIi;
   }

   public boolean IIiilIiiiIii() {
      return this.IlIlIilIIi;
   }

   public int IlIillIiilIi() {
      return this.liiIIilIIi;
   }

   public lliiilIiiliiilIi(
      class_243 pos,
      class_243 eye,
      class_238 box,
      class_243 velocity,
      boolean onGround,
      float health,
      float absorption,
      iiIllIlIIlllIl armor,
      float armorMinDurability,
      boolean totemInOffhand,
      boolean totemConfirmed,
      int totems,
      int crystals,
      int obsidian,
      int anchors,
      int glowstone,
      int gapples,
      int food,
      int pearls,
      int xpBottles,
      boolean pearlReady,
      float swordCharge,
      int foodLevel,
      int ticksSinceFresh,
      float lastScaledTaken,
      int pops,
      long lastPopTick,
      boolean usingItem,
      boolean handSwapBusy,
      boolean inputMasked,
      IlillIllllillIll hole,
      int pingMs,
      double loopMs
   ) {
      this.lIlIIilIIi = pos;
      this.iIlIIilIIi = eye;
      this.IllIIilIIi = box;
      this.lllIIilIIi = velocity;
      this.illIIilIIi = onGround;
      this.IilIIilIIi = health;
      this.lilIIilIIi = absorption;
      this.iilIIilIIi = armor;
      this.IIiIIilIIi = armorMinDurability;
      this.lIiIIilIIi = totemInOffhand;
      this.iIiIIilIIi = totemConfirmed;
      this.IliIIilIIi = totems;
      this.lliIIilIIi = crystals;
      this.iliIIilIIi = obsidian;
      this.IiiIIilIIi = anchors;
      this.liiIIilIIi = glowstone;
      this.iiiIIilIIi = gapples;
      this.IIIlIilIIi = food;
      this.lIIlIilIIi = pearls;
      this.iIIlIilIIi = xpBottles;
      this.IlIlIilIIi = pearlReady;
      this.llIlIilIIi = swordCharge;
      this.ilIlIilIIi = foodLevel;
      this.IiIlIilIIi = ticksSinceFresh;
      this.liIlIilIIi = lastScaledTaken;
      this.iiIlIilIIi = pops;
      this.IIllIilIIi = lastPopTick;
      this.lIllIilIIi = usingItem;
      this.iIllIilIIi = handSwapBusy;
      this.IlllIilIIi = inputMasked;
      this.llllIilIIi = hole;
      this.illlIilIIi = pingMs;
      this.IillIilIIi = loopMs;
   }

   public int IIIilIIiiIIi() {
      return this.IiiIIilIIi;
   }

   public float iIIIlIlIIl() {
      return this.liIlIilIIi;
   }

   public float IliIlllilIi() {
      return this.IilIIilIIi + this.lilIIilIIi;
   }

   public float IlIlllIlilIl() {
      return this.lilIIilIIi;
   }

   public IlillIllllillIll illIlIilIl() {
      return this.llllIilIIi;
   }

   public double IIiIllIiIl() {
      return this.IillIilIIi;
   }

   public long IiIIlliIIl() {
      return this.IIllIilIIi;
   }

   public int Iiiiliiiiiii() {
      return this.ilIlIilIIi;
   }

   public class_243 liiiIIllIl() {
      return this.lIlIIilIIi;
   }

   public int Iiilliiliiil() {
      return this.iliIIilIIi;
   }

   public int lilIliilIl() {
      return this.illlIilIIi;
   }

   public int IIillIiliIil() {
      return this.IliIIilIIi;
   }

   public iiIllIlIIlllIl IiIlliIliiIl() {
      return this.iilIIilIIi;
   }

   public class_243 lIiiIiIlilli() {
      return this.lllIIilIIi;
   }

   public float IIIllIIliIIl() {
      return this.IilIIilIIi;
   }

   public int llIIlilIIl() {
      return this.iiIlIilIIi;
   }

   public boolean Iilllilliill() {
      return this.iIiIIilIIi;
   }

   public float Iliilliiilii() {
      return this.llIlIilIIi;
   }

   public class_243 iIlIlllllill() {
      return this.iIlIIilIIi;
   }

   public boolean iiIIlIIlIl() {
      return this.lIllIilIIi;
   }
}

package gg.corz;

import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;

public record llIIlllilIIlll(
   class_2338 base,
   List<class_2338> obsidian,
   int blastIndex,
   long breakTick,
   iilIIlIlIIiIIlIl kind,
   double value,
   boolean pops,
   boolean kills,
   float selfDamage,
   class_243 stand,
   class_2350 face,
   boolean holding
) {
   private final class_243 lilliililiilliilil;
   private final iilIIlIlIIiIIlIl IiIliililliIliilil;
   private final long llIliilililIliilil;
   private final boolean iIiliililIliliilil;
   private final class_2350 IIiliilillIiliilil;
   private final float illliililIilliilil;
   private final boolean Illliilillllliilil;
   private final int iIIliililIlIliilil;
   private final boolean lIlliililiIlliilil;
   private final class_2338 liiIiililiiiIiilil;
   private final double iiIliililIIlliilil;
   private final List<class_2338> IIIliilillIIliilil;

   public llIIlllilIIlll(
      class_2338 base,
      List<class_2338> obsidian,
      int blastIndex,
      long breakTick,
      iilIIlIlIIiIIlIl kind,
      double value,
      boolean pops,
      boolean kills,
      float selfDamage,
      class_243 stand,
      class_2350 face,
      boolean holding
   ) {
      this.liiIiililiiiIiilil = base;
      this.IIIliilillIIliilil = obsidian;
      this.iIIliililIlIliilil = blastIndex;
      this.llIliilililIliilil = breakTick;
      this.IiIliililliIliilil = kind;
      this.iiIliililIIlliilil = value;
      this.lIlliililiIlliilil = pops;
      this.Illliilillllliilil = kills;
      this.illliililIilliilil = selfDamage;
      this.lilliililiilliilil = stand;
      this.IIiliilillIiliilil = face;
      this.iIiliililIliliilil = holding;
   }

   public double iliIiiliiiii() {
      return this.iiIliililIIlliilil;
   }

   public long IilliliilIIi() {
      return this.llIliilililIliilil;
   }

   public class_2350 Illlllllilll() {
      return this.IIiliilillIiliilil;
   }

   public class_243 IIlllIlliIll() {
      return this.lilliililiilliilil;
   }

   public List<class_2338> liiiIIllIl() {
      return this.IIIliilillIIliilil;
   }

   public class_2338 IliIlllilIi() {
      return this.liiIiililiiiIiilil;
   }

   public float IiIlliIliiIl() {
      return this.illliililIilliilil;
   }

   public iilIIlIlIIiIIlIl lIiiIiIlilli() {
      return this.IiIliililliIliilil;
   }

   public int iIlIlllllill() {
      return this.iIIliililIlIliilil;
   }

   public boolean IIIllIIliIIl() {
      return this.lIlliililiIlliilil;
   }

   public boolean Iilllilliill() {
      return this.iIiliililIliliilil;
   }

   public boolean IlIlllIlilIl() {
      return this.Illliilillllliilil;
   }
}

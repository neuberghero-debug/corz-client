package gg.corz;

import net.minecraft.class_243;

public record IlliIiIlllliIiIl(
   IIliIilIliIi kind, class_243 feet, double tolerance, boolean sprint, boolean noJump, long wtapTick, class_243 attackAt, iiIIllIlIIlIllIl goal
) {
   private final class_243 lliIlliIll;
   private final double iliIlliIll;
   private final IIliIilIliIi IliIlliIll;
   private final iiIIllIlIIlIllIl lIIllliIll;
   private final class_243 IIIllliIll;
   private final boolean IiiIlliIll;
   private final long iiiIlliIll;
   private final boolean liiIlliIll;

   public IlliIiIlllliIiIl(IIliIilIliIi kind, class_243 sprint, double feet, boolean noJump, boolean tolerance, long wtapTick) {
      this(kind, sprint, feet, noJump, tolerance, wtapTick, null, null);
   }

   public class_243 liiiIIllIl() {
      return this.lliIlliIll;
   }

   public boolean lIiiIiIlilli() {
      return this.liiIlliIll;
   }

   public IIliIilIliIi IliIlllilIi() {
      return this.IliIlliIll;
   }

   public long iliIiiliiiii() {
      return this.iiiIlliIll;
   }

   public class_243 IIIllIIliIIl() {
      return this.IIIllliIll;
   }

   public double iIlIlllllill() {
      return this.iliIlliIll;
   }

   public iiIIllIlIIlIllIl IlIlllIlilIl() {
      return this.lIIllliIll;
   }

   public boolean IilliliilIIi() {
      return this.IiiIlliIll;
   }

   public IlliIiIlllliIiIl(
      IIliIilIliIi kind, class_243 feet, double tolerance, boolean sprint, boolean noJump, long wtapTick, class_243 attackAt, iiIIllIlIIlIllIl goal
   ) {
      this.IliIlliIll = kind;
      this.lliIlliIll = feet;
      this.iliIlliIll = tolerance;
      this.IiiIlliIll = sprint;
      this.liiIlliIll = noJump;
      this.iiiIlliIll = wtapTick;
      this.IIIllliIll = attackAt;
      this.lIIllliIll = goal;
   }
}

package gg.corz;

import net.minecraft.class_1297;
import net.minecraft.class_1799;

public class IIlIIiilIlIIii extends ilIllIiIll implements liIIIiiiiIIIii, ilIIIiiIiIIIii {
   private final iiIiiilIIliiil lIillllIIl;
   private final iiIiiilIIliiil iIillllIIl;
   private final iiIiiilIIliiil IIillllIIl = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","Q03LpV9mSFNdaUTkib522KsitLP4qDhkK4xnfSG3T3oEjVKhbR/pzPbrIJcSGw==">(),
      IliIlllilIi<"IliIlllilIi","HDXsGCt3zbsfTp9D7wDFf7zZaGF3b4lgKKwNVXm29P4Lx9ksWXfRPjcZL8YswX7QnMSty0bSlIDb1Qh7+PJ8c2+mBNvU0787c4MMxbRqW1ukG13Tu58pmnv+KfWfMabc2aozkWY=">(),
      true
   );

   @Override
   public int liIlliiIll() {
      return (((-787926434 << 21 | -787926434 >>> 11) ^ -59) >>> 3 | ((-787926434 << 21 | -787926434 >>> 11) ^ -59) << 29) ^ 1988410296;
   }

   @Override
   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      iIIiIlIiIlIiIlIi.IIlllIlliIll(event);
   }

   @Override
   protected void iIIIlIlIIl() {
      iIIiIlIiIlIiIlIi.IliIlllilIi();
   }

   @Override
   protected void Iilililiiili() {
      iIIiIlIiIlIiIlIi.Illlllllilll(this);
   }

   @Override
   public iilllIllIIillIll IIllllIlll(Object presser, class_1297 target) {
      return iIIiIlIiIlIiIlIi.liiiIIllIl(presser, target);
   }

   @Override
   public int iiiIlIIIll() {
      return 2;
   }

   @Override
   public boolean IlIllllIll(Object weapon, class_1799 presser) {
      if (this.lIillllIIl.Iilllilliill() && !lIlllIliIlllIl.IilliliilIIi(presser)) {
         return false;
      } else {
         return this.IIillllIIl.Iilllilliill() && weapon != null
            ? Iiiilllliiilll.field_1690 != null && Iiiilllliiilll.field_1690.field_1886.method_1434()
            : true;
      }
   }

   public IIlIIiilIlIIii() {
      super(IliIlllilIi<"IliIlllilIi","5hcKrEmUEmEfdIwcB8/wBGKH23vy8iZ9grfKO7NvVwUKfxh92UN+L1y1OlgpuWYz">(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.lIillllIIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","84bL89pEKJIrZ7ZGJ8cUDjKktfT9QwvcYzMZf6OuK3i/nhsYvRBy+GBj">(),
         IliIlllilIi<"IliIlllilIi","opgcjcUCAXlp+sei2XNM97MnUnXlIQC78Gnon/gMxoJABOwgBEBeuiedSirvF+xy1JzbNHf4PTUj25coQASZGO7L3ew03faPiE8LwBJ9GswxXj0SKHA=">(),
         true
      );
      this.iIillllIIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","zjT2PEx45vecsGf2YlaVCkJYEVlzRG79WNK+w3QhZ2mKx61dbQ==">(),
         IliIlllilIi<"IliIlllilIi","eI2GJxoYBTsRyC+JTnvG7U2KbK00Wd0a2FEipIkIzk3W9ncfZNIHiC067uVJR0S43nXjPvaqxsz0b+jBwNgbflB7tEnWu1CNCCNNkg==">(),
         true
      );
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIillllIIl, this.lIillllIIl, this.iIillllIIl});
   }

   @Override
   public iiIIIlIiIIlIIlIi lIIlliIIll() {
      return iiIIIlIiIIlIIlIi.IliIlllilIi(this.iIillllIIl.Iilllilliill());
   }
}

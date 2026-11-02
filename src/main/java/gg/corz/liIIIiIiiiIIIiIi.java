package gg.corz;

import com.corz.client.mixins.AccessorBiomeAccess;
import net.minecraft.class_2561;

public class liIIIiIiiiIIIiIi extends ilIllIiIll {
   private final iiIiiilIIliiil llillilIIi;
   private final iiIiiilIIliiil IlillilIIi = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","O5QUOJ7OjPleHGnecP8XuB6337QWvEBmC85rqNUEoq2W0+iC5lOhe+k4kV1t">(),
      IliIlllilIi<"IliIlllilIi","l4h7eeAl2tNFwwZAoMVXmT3MOniv41FxWurD/mkg/beLe9iqrZoItHH26Et2vnd+UlTL9rDY3F0jLlY91A7OhYfrEn4hKh7Po+rud8+rnzT62rHtfq3ybSvcgQH6RgEnEjEFimnN3Qk=">(),
      true
   );

   private void iiiIlIIIll(String msg) {
      if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(msg), false);
      }
   }

   public liIIIiIiiiIIIiIi() {
      super(IliIlllilIi<"IliIlllilIi","Q5KvgPv46KnNq/ol3tqxZkbE8DLAuR9Q87wCSSxvmyRNFu8iv9BfBg==">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.llillilIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","OWuevf3/rISIiV/kqX+1iBH8USkq+OiNCdpzSeEn8+93YMcb">(),
         IliIlllilIi<"IliIlllilIi","8ZCH8xQj07PWGYMbsQuWZOH8aDD0mbbrGIUurla8NuuNL1kNAIcRwzGvuJKKcoi1rMLXompYu1XwIR18pnxc">(),
         true
      );
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IlillilIIi, this.llillilIIi});
   }

   @Override
   protected void Illillliilli() {
      long var5 = -3043199488124357781L;
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         long var1 = ((AccessorBiomeAccess)Iiiilllliiilll.field_1687.method_22385()).getSeed();
         var5 ^= ((long)Iiiilllliiilll.method_1542() << 32 ^ var5) & -1L << 32;
         String var4 = (int)(var5 >>> 32) != 0
            ? IliIlllilIi<"IliIlllilIi","zcX9H9VcoFzuTjXZb9TMcO0HuIhFdxKEQ2izJ8gCWexpGcvmfKE=">()
            : IliIlllilIi<"IliIlllilIi","fgnBtexi2HpxqhxkM1R3NChIcekJrlc3So5Y0WAaCu7aMqSWLCZ3nL/0xqli5GyW/1Xww/960x2eHiQDOz5yVG2R365+AFtICxk4e3KdAU3Yww==">();
         this.iiiIlIIIll(IliIlllilIi<"IliIlllilIi","uDqVly4x9EAyNKtX/j+a8wT64R4UgEw4i4pN5+Y/JWkecIchBqBTuBCKPmDuKexviA==">() + var4);
         this.iiiIlIIIll(IliIlllilIi<"IliIlllilIi","PICkClA8F58AtLjpb4//vqPemZGrwbfun89jHAI7wIGsrrCmpp/9TkeBhF0=">() + var1);
         if (this.llillilIIi.Iilllilliill()) {
            this.iiiIlIIIll(IliIlllilIi<"IliIlllilIi","Tiy+ptE7ZBNtSVYAQ+MGknbR6sQvGlYmG/PNMd0Bohdd6GSZDqF8iHsq">() + Long.toHexString(var1));
         }

         if (this.IlillilIIi.Iilllilliill()) {
            Iiiilllliiilll.field_1774.method_1455(Long.toString(var1));
            this.iiiIlIIIll(
               IliIlllilIi<"IliIlllilIi","3blUpotpJkPKSnu4qLZfnAGk8s9IJmaW8rjdSSn1QLVj6V0nudV6agp5GuvCSbsfO9CzM3VEuClUvM3cG7N4En/V4ua+PU5V5aztKkb7qNQq">()
            );
            Iliiiiilliiiii.IliIlllilIi()
               .iIlIlllllill(
                  IliIlllilIi<"IliIlllilIi","Q5KvgPv46KnNq/ol3tqxZkbE8DLAuR9Q87wCSSxvmyRNFu8iv9BfBg==">(),
                  IliIlllilIi<"IliIlllilIi","0u1woYmb7WXIVzGEyCOdLLA0wd1EhDEAF2CccE0/yQjzBewTjLp5atVJtg==">() + var1,
                  true
               );
         } else {
            Iliiiiilliiiii.IliIlllilIi()
               .iIlIlllllill(
                  IliIlllilIi<"IliIlllilIi","Q5KvgPv46KnNq/ol3tqxZkbE8DLAuR9Q87wCSSxvmyRNFu8iv9BfBg==">(),
                  IliIlllilIi<"IliIlllilIi","/Z6ZhcGNkcJAbzSk5W9uaXOhy5o3Ft46WL5u9Ab0J6rWSt4T">() + var1,
                  true
               );
         }

         this.IIillIiliIil(false);
      } else {
         Iliiiiilliiiii.IliIlllilIi()
            .iIlIlllllill(
               IliIlllilIi<"IliIlllilIi","Q5KvgPv46KnNq/ol3tqxZkbE8DLAuR9Q87wCSSxvmyRNFu8iv9BfBg==">(),
               IliIlllilIi<"IliIlllilIi","ngpvaYfigKkbErw+dmrYptDDMJS5UXAF1Ggleky+LQaCKjSdmZSdlpft/Vq4Jw==">(),
               false
            );
         this.IIillIiliIil(false);
      }
   }
}

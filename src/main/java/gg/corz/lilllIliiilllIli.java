package gg.corz;

import java.util.List;

public class lilllIliiilllIli extends ilIllIiIll {
   private static boolean IliilIllIi;

   @Override
   public boolean Iilllilliill() {
      return true;
   }

   public lilllIliiilllIli() {
      super(IliIlllilIi<"IliIlllilIi","V4iMIkh94SUOccw1tmvDgYauHMq0V56EfXlugum1MagL">(), lllIllillIll.IlllIIIillllIIIi);
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            new ililliIiIiilliIi(
                  IliIlllilIi<"IliIlllilIi","Ak/gksxmLqi3eUDB5HK8VYJplBMVYEVtNphnHmd9iw4rPlNoQo8E5J+IOoqH8KjcuF1PrSLyXZ65mM+SkoljgzFz">(),
                  IliIlllilIi<"IliIlllilIi","g2iQoVspzE7BLRxsMSVulSXEFfTZO0O1CJsSBMU9yIOo2D1dmS+whrrq7IeAFBhClUveKViEgtV4/ly/uUJczqu2gtVHkfAbWALWdA5iBiNPG1ADgpUE67SIlIPdCpda">(),
                  IliIlllilIi<"IliIlllilIi","qs66EwBvXz+x/JDVSIA23moWcwx4a5fQlzZimNOIVnLVw0ti">(),
                  this::lIIlliIIll
               )
               .Ililllililil()
         }
      );
   }

   public static boolean iiiIlIIIll() {
      return IliilIllIi;
   }

   public void lIIlliIIll() {
      if (llilIllililIll.iliIiiliiiii(iIlIilIlIllIilIl.class) instanceof iIlIilIlIllIilIl var1) {
         var1.lIIIiIlliIIIiIll();
      }

      List var14 = lllIIiillIIi.IliIlllilIi(llilIllililIll.IilliliilIIi());
      if (var14.isEmpty()) {
         Iliiiiilliiiii.IliIlllilIi()
            .iIlIlllllill(
               IliIlllilIi<"IliIlllilIi","V4iMIkh94SUOccw1tmvDgYauHMq0V56EfXlugum1MagL">(),
               IliIlllilIi<"IliIlllilIi","TZyINmLYvyIFrFZ+fUPiOxR+v7AKdm18fpSg3OymhKYtbV88Ec/ft98TwsSVNooxQ3eXqMiOZaQ=">(),
               false
            );
      } else {
         IliilIllIi = true;

         try (AutoCloseable var15 = Iliiiiilliiiii.IliIlllilIi().liiiIIllIl()) {
            for (ilIllIiIll var4 : var14) {
               var4.IIillIiliIil(false);
            }
         } catch (Exception var12) {
         } finally {
            IliilIllIi = false;
         }

         iiiIIIlIIIlIIl.IilliliilIIi();
         Iliiiiilliiiii.IliIlllilIi()
            .iIlIlllllill(
               IliIlllilIi<"IliIlllilIi","riVFYYGlbdcPLxXWKVBB6aSN4GdrHPvmLSNb1YRlQj3EaYHeZqLKmyXFbA==">(),
               var14.size() == 1
                  ? IliIlllilIi<"IliIlllilIi","cG1n6UbxX+NgORXnKuRYxpcOZpTxgeX3ASp1V8zWpm0l1JftmbmaKvtiOriMC8dAZ1bumDM1DXc=">()
                  : IliIlllilIi<"IliIlllilIi","5Z3I6chNNipAqtEgWOzz7QjQsMLQgA2SI7vpYsdgwZ8=">()
                     + var14.size()
                     + IliIlllilIi<"IliIlllilIi","PUk24uzZOUh/ctXxI9RaAVfkG9A+ypGTB5VNwtZa1w1oCrEvTcJIXiREerAuqYfSkOmON6BpGKtt">(),
               false
            );
      }
   }

   @Override
   public void Ililllililil() {
      this.lIIlliIIll();
   }
}

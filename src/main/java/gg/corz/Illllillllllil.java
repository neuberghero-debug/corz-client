package gg.corz;

public final class Illllillllllil {
   private Illllillllllil() {
   }

   public static float[] IliIlllilIi(int look) {
      return switch (look) {
         case 0 -> new float[]{0.0F, 90.0F};
         case 1 -> new float[]{0.0F, -90.0F};
         case 2 -> new float[]{180.0F, 0.0F};
         case 3 -> new float[]{0.0F, 0.0F};
         case 4 -> new float[]{90.0F, 0.0F};
         case 5 -> new float[]{-90.0F, 0.0F};
         default -> throw new IllegalArgumentException(IilliliilIIi<"IilliliilIIi","umpDd1QjvPISHu3Y0ig4Eij4L9t+s6Hn5mwmQurBeZh4sf7DcrkuIakCpg==">() + look);
      };
   }

   private static float iIlIlllllill(float d) {
      d %= 360.0F;
      if (d >= 180.0F) {
         d -= 360.0F;
      }

      if (d < -180.0F) {
         d += 360.0F;
      }

      return d;
   }

   public static boolean liiiIIllIl(int actualPitch, float tol, float look, float actualYaw) {
      float[] var4 = IliIlllilIi(actualPitch);
      float var5 = Math.abs(iIlIlllllill(tol - var4[0]));
      float var6 = Math.abs(look - var4[1]);
      return actualPitch != 1 && actualPitch != 0 ? var5 <= actualYaw && var6 <= actualYaw : var6 <= actualYaw;
   }
}

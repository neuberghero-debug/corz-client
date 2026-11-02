package gg.corz.injector.bootstrap;

import com.corz.client.qvm.Runtime;
import java.lang.invoke.MethodHandles;

public final class PayloadBootstrap {
   private static boolean initialized;
   private static String launchKey;
   private static String ticket;
   private static boolean payloadAuthorized;
   private static String payloadHash;

   private PayloadBootstrap() {
      Runtime.run(
         -6782897435431839320L, 398886376, new Object[]{this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
      );
   }

   public static synchronized void initializeFromProperties() {
      Runtime.run(-5406457770471979937L, 1324825584, new Object[18]);
   }

   public static synchronized void authorizePayload() {
      Runtime.run(-4914338643098637265L, 1486753247, new Object[15]);
   }

   static {
      Runtime.loadVm(PayloadBootstrap.class, MethodHandles.lookup());
   }
}

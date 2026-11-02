package gg.corz.injector;

import gg.corz.IilliliilIIi;
import gg.corz.injector.bootstrap.PayloadBootstrap;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public final class CorzPreLaunch implements PreLaunchEntrypoint {
   public void onPreLaunch() {
      IilliliilIIi.IliIlllilIi();

      try {
         PayloadBootstrap.initializeFromProperties();
         IilliliilIIi.iIlIlllllill();
      } catch (Throwable var3) {
         IilliliilIIi.IilliliilIIi(var3);
         if (var3 instanceof RuntimeException var4) {
            throw var4;
         } else if (var3 instanceof Error var2) {
            throw var2;
         } else {
            throw new RuntimeException(IliIlllilIi<"IliIlllilIi","tc7BWUXbPQKFtXSA+C6UPlzZf1zbNFaUsGtU2l5OW081hTxYfM7ppqCv0m5pbU1hcw==">(), var3);
         }
      }
   }
}
